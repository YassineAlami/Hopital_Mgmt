import { Component, EventEmitter, Input, OnInit } from '@angular/core';
import { PatientService } from 'src/app/services/patient.service';
import { Patients } from 'src/app/models/Patients';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-patient',
  templateUrl: './view-patient.component.html',
  styleUrls: ['./view-patient.component.css']
})
export class ViewPatientComponent implements OnInit {

  patient!: Patients;

  constructor(private PatientService: PatientService,private route: ActivatedRoute) { }
 

  ngOnInit(): void {
    let id=this.route.snapshot.params['id'];
     this.getPatient(id);
  }

  getPatient(id?: number): void {
    this.PatientService.getPatient(id).subscribe(data => {
      this.patient = data;
    });
  }

}
function param(target: ViewPatientComponent, propertyKey: 'id'): void {
  throw new Error('Function not implemented.');
}

