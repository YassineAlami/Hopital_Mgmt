import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Traitements } from '../models/Traitements';

@Injectable({
  providedIn: 'root'
})
export class TraitementsService {
  private apiUrl = 'http://localhost:8080/api/v1/Traitements';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddTraitements';

  constructor(private http: HttpClient) {}

  createTraitements(Traitements: Traitements): Observable<Object> {
    return this.http.post<Traitements>(`${this.apiUrlAdd}`, Traitements);
  }
  getAllTraitements(): Observable<Traitements[]> {
    return this.http.get<Traitements[]>(this.apiUrl);
  }
}
