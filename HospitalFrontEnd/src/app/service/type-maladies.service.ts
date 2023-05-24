import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Type_maladies } from '../models/Type_maladies';

@Injectable({
  providedIn: 'root'
})
export class TypeMaladiesService {
  private apiUrl = 'http://localhost:8080/api/v1/Type_maladies';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddType_maladies';

  constructor(private http: HttpClient) {}

  createType_maladies(Type_maladies: Type_maladies): Observable<Object> {
    return this.http.post<Type_maladies>(`${this.apiUrlAdd}`, Type_maladies);
  }
  getAllType_maladies(): Observable<Type_maladies[]> {
    return this.http.get<Type_maladies[]>(this.apiUrl);
  }
}
