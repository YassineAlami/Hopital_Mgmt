import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Temps_personnels } from '../models/Temps_personnel';

@Injectable({
  providedIn: 'root'
})
export class TempsPersonnelService {
  private apiUrl = 'http://localhost:8080/api/v1/Temps_personnel';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddTemps_personnel';

  constructor(private http: HttpClient) {}

  createTemps_personnel(tempsPersonnel: Temps_personnels): Observable<Object> {
    return this.http.post<Temps_personnels>(`${this.apiUrlAdd}`, tempsPersonnel);
  }
  getAllTemps_personnels(): Observable<Temps_personnels[]> {
    return this.http.get<Temps_personnels[]>(this.apiUrl);
  }
}
