import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Hospitalisations } from '../models/Hospitalistations';

@Injectable({
  providedIn: 'root'
})
export class HospitalisationService {
  private apiUrl = 'http://localhost:8080/api/v1/Hospitalisations';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddHospitalisations';

  constructor(private http: HttpClient) {

  }
  createHospitalisations(Hospitalisations: Hospitalisations): Observable<Object> {
    return this.http.post<Hospitalisations>(`${this.apiUrlAdd}`, Hospitalisations);
  }
  getAllHospitalisations(): Observable<Hospitalisations[]> {
    return this.http.get<Hospitalisations[]>(this.apiUrl);
  }
}
