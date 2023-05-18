import { Component } from '@angular/core';
import { Dossier_Medicaux } from '../models/Dossier_medicaux';
import { DossierMedicauxService } from '../service/dossier-medicaux.service';

@Component({
  selector: 'app-list-dossier-medicaux',
  templateUrl: './list-dossier-medicaux.component.html',
  styleUrls: ['./list-dossier-medicaux.component.css']
})
export class ListDossierMedicauxComponent {
  DosMedic! :Dossier_Medicaux[];

  constructor(private DosMedicserv: DossierMedicauxService) { }

  ngOnInit(): void {
    this.getAllHospitalisations();
  }

  getAllHospitalisations(): void {
    this.DosMedicserv.getAllHDossiersMedicaux().subscribe(data => {
      this.DosMedic = data;
    });
  }
}
