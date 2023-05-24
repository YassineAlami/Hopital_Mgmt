import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Vaccins } from '../models/Vaccins';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VaccinsService {
  private apiUrl = 'http://localhost:8080/api/v1/Vaccins';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddVaccins';

  constructor(private http: HttpClient) {}

  createVaccins(Vaccins: Vaccins): Observable<Object> {
    return this.http.post<Vaccins>(`${this.apiUrlAdd}`, Vaccins);
  }
  getAllVaccins(): Observable<Vaccins[]> {
    return this.http.get<Vaccins[]>(this.apiUrl);
  }
}
