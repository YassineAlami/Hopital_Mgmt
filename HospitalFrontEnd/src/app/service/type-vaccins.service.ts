import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Type_Vaccins } from '../models/Type_vaccins';

@Injectable({
  providedIn: 'root'
})
export class TypeVaccinsService {
  private apiUrl = 'http://localhost:8080/api/v1/TypeVaccins';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddTypeVaccins';

  constructor(private http: HttpClient) {}

  createTypeVaccins(TypeVaccins: Type_Vaccins): Observable<Object> {
    return this.http.post<Type_Vaccins>(`${this.apiUrlAdd}`, TypeVaccins);
  }
  getAllTypeVaccins(): Observable<Type_Vaccins[]> {
    return this.http.get<Type_Vaccins[]>(this.apiUrl);
  }
}
