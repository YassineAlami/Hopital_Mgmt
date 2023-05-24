import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Dossier_Medicaux } from '../models/Dossier_medicaux';

@Injectable({
  providedIn: 'root'
})
export class DossierMedicauxService {
  private apiUrl = 'http://localhost:8080/api/v1/DossiersMedicaux';

  constructor(private http: HttpClient) {

  }
  getAllHDossiersMedicaux(): Observable<Dossier_Medicaux[]> {
    return this.http.get<Dossier_Medicaux[]>(this.apiUrl);
  }
}
