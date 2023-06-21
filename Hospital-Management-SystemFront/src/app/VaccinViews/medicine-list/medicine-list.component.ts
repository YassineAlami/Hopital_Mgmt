import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VaccinsService } from 'src/app/services/vaccins.service';
import { Vaccins } from 'src/app/models/Vaccins';


@Component({
  selector: 'app-medicine-list',
  templateUrl: './medicine-list.component.html',
  styleUrls: ['./medicine-list.component.css']
})
export class MedicineListComponent implements OnInit {

  vaccins: Vaccins[];

  constructor(private medicineService: VaccinsService,
    private router: Router) { }

  ngOnInit(): void {

    this.getMedicines();

  }

  private getMedicines(){
    this.medicineService.getAllVaccins().subscribe(data => {this.vaccins = data;
    });

}

updateMedicine(id: number){

  this.router.navigate(['updatemedicine', id]);

}

deleteMedicine(id: number){
  this.medicineService.deleteVaccin(id).subscribe( data => { 
    console.log(data);
    this.getMedicines();
  })
}
}
