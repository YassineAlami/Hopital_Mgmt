import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Dossier_Medicaux } from '../models/Dossier_medicaux';

@Injectable({
  providedIn: 'root'
})
export class DossierMedicauxService {
  private apiUrl = 'http://localhost:8080/api/v1/DossiersMedicaux';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddDossiersMedicaux';

  constructor(private http: HttpClient) {}
  createDossiersMedicaux(DossiersMedicaux: Dossier_Medicaux): Observable<Object> {
    return this.http.post<Dossier_Medicaux>(`${this.apiUrlAdd}`, DossiersMedicaux);
  }

  getAllHDossiersMedicaux(): Observable<Dossier_Medicaux[]> {
    return this.http.get<Dossier_Medicaux[]>(this.apiUrl);
  }
}
