import { Component } from '@angular/core';
import { Patients } from '../models/Patients';
import { PatientsService } from '../service/patients.service';

@Component({
  selector: 'app-add-patient',
  templateUrl: './add-patient.component.html',
  styleUrls: ['./add-patient.component.css']
})
export class AddPatientComponent {

  Patent: Patients= new Patients();
  // @Output() Patent= new EventEmitter<Patients>();
  constructor(private PatientSer: PatientsService) { }
  ngOnInit(): void {
  }
  savePatient(): void {
    this.PatientSer.createPatient(this.Patent).subscribe(data => {
      console.log(data);
    });
  }
  onSubmit(): void {
    console.log('test');
    this.savePatient();
  }
}
