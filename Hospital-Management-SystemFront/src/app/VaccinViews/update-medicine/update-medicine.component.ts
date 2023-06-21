import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VaccinsService } from '../../services/vaccins.service';
import { Vaccins } from '../../models/Vaccins';


@Component({
  selector: 'app-update-medicine',
  templateUrl: './update-medicine.component.html',
  styleUrls: ['./update-medicine.component.css']
})
export class UpdateMedicineComponent implements OnInit {

  id: number;
  medicine: Vaccins = new Vaccins();
  constructor(private medicineService: VaccinsService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.medicineService.getVaccin(this.id).subscribe(data => {
      this.medicine = data;
    } 
    , error => console.log(error));
  }

  onSubmit() {
    this.medicineService.updateVaccin(this.id, this.medicine).subscribe(data => { 
      this.goToMedicineList();
    } 
    , error => console.log(error));

  }

  goToMedicineList() {
    this.router.navigate(['/medicinelist']);
  }

}
