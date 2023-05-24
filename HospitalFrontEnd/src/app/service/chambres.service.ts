import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Chambres } from '../models/Chambres';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ChambresService {

  private apiUrl = 'http://localhost:8080/api/v1/Chambres';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddChambres';

  constructor(private http: HttpClient) {}

  createChambres(Chambres: Chambres): Observable<Object> {
    return this.http.post<Chambres>(`${this.apiUrlAdd}`, Chambres);
  }
  getAllChambres(): Observable<Chambres[]> {
    return this.http.get<Chambres[]>(this.apiUrl);
  }
}
