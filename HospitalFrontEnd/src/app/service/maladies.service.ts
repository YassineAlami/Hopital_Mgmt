import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Maladies } from '../models/Maladies';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class MaladiesService {
  private apiUrl = 'http://localhost:8080/api/v1/Maladies';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddMaladies';

  constructor(private http: HttpClient) {}

  createMaladies(Maladies: Maladies): Observable<Object> {
    return this.http.post<Maladies>(`${this.apiUrlAdd}`, Maladies);
  }
  getAllMaladies(): Observable<Maladies[]> {
    return this.http.get<Maladies[]>(this.apiUrl);
  }
}
