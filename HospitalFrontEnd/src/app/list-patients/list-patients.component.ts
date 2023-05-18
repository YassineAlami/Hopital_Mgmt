import { Component,OnInit  } from '@angular/core';
import { Patients } from '../models/Patients';
import { PatientsService } from '../service/patients.service';

@Component({
  selector: 'app-list-patients',
  templateUrl: './list-patients.component.html',
  styleUrls: ['./list-patients.component.css']
})

export class ListPatientsComponent implements OnInit {

Patents!: Patients[];

  constructor(private PatientsService: PatientsService) { }

  ngOnInit(): void {
    this.getAllPatients();
  }

  getAllPatients(): void {
    this.PatientsService.getAllPatients().subscribe(data => {
      this.Patents = data;
    });
  }
}
