import { Injectable } from '@angular/core';
import { Medecins } from '../models/Medecins';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class MedecinsService {

  private apiUrl = 'http://localhost:8080/api/v1/Medecins';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddMedecins';

  constructor(private http: HttpClient) {}

  createMedecins(Medecins: Medecins): Observable<Object> {
    return this.http.post<Medecins>(`${this.apiUrlAdd}`, Medecins);
  }
  getAllMedecins(): Observable<Medecins[]> {
    return this.http.get<Medecins[]>(this.apiUrl);
  }
}
