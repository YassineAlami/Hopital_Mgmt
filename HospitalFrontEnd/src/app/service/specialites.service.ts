import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Specialites } from '../models/Specialites';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class SpecialitesService {

  private apiUrl = 'http://localhost:8080/api/v1/Specialites';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddSpecialites';

  constructor(private http: HttpClient) {}

  createSpecialites(Specialites: Specialites): Observable<Object> {
    return this.http.post<Specialites>(`${this.apiUrlAdd}`, Specialites);
  }
  getAllSpecialites(): Observable<Specialites[]> {
    return this.http.get<Specialites[]>(this.apiUrl);
  }
}
