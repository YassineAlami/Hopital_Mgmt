import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Creneaux } from '../models/Creneaus';

@Injectable({
  providedIn: 'root'
})
export class CreneausService {

  private apiUrl = 'http://localhost:8080/api/v1/Creneaux';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddCreneaux';

  constructor(private http: HttpClient) {}

  createCreneaus(Creneaus: Creneaux): Observable<Object> {
    return this.http.post<Creneaux>(`${this.apiUrlAdd}`, Creneaus);
  }
  getAllCreneaus(): Observable<Creneaux[]> {
    return this.http.get<Creneaux[]>(this.apiUrl);
  }
}
