import { Component } from '@angular/core';
import { HospitalisationService } from '../service/hospitalisation.service';
import { Hospitalisations } from '../models/Hospitalistations';

@Component({
  selector: 'app-list-hospitalisations',
  templateUrl: './list-hospitalisations.component.html',
  styleUrls: ['./list-hospitalisations.component.css']
})
export class ListHospitalisationsComponent {
  Hospitalisation! :Hospitalisations[];

  constructor(private Hospitalisationserv: HospitalisationService) { }

  ngOnInit(): void {
    this.getAllHospitalisations();
  }

  getAllHospitalisations(): void {
    this.Hospitalisationserv.getAllHospitalisations().subscribe(data => {
      this.Hospitalisation = data;
    });
  }
}
