import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PatientService } from '../../services/patient.service';
import { Patients } from '../../models/Patients';

@Component({
  selector: 'app-createpatient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})
export class CreatepatientComponent implements OnInit {

  patient: Patients = new Patients();
  constructor(private patientServ: PatientService,private router: Router) { }

  ngOnInit(): void {
  }

  savePatient() {
      this.patientServ.createPatient(this.patient).subscribe(data => {
     
  },
  error => console.log(error));
}
  goToPatientList() {
    this.router.navigate(['/docdash']);


  }

  onSubmit() {
    console.log(this.patient);
    this.savePatient();
  }

}
