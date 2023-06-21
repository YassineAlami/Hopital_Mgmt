import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VaccinsService } from 'src/app/services/vaccins.service';
import { Vaccins } from 'src/app/models/Vaccins';


@Component({
  selector: 'app-createmedicine',
  templateUrl: './createmedicine.component.html',
  styleUrls: ['./createmedicine.component.css']
})
export class CreatemedicineComponent implements OnInit {

  medicine: Vaccins = new Vaccins();
  constructor(private medicineService: VaccinsService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveMedicine() {
    this.medicineService.createVaccin(this.medicine).subscribe(data => {
      console.log(data);
      this.goToMedicineList();
    }, 
    error => console.log(error));
  }

  goToMedicineList() {

    this.router.navigate(['/medicinelist']);

  }

  onSubmit() {
    
    console.log(this.medicine);
    this.saveMedicine();
  }

}
