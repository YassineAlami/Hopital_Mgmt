import { Injectable } from '@angular/core';
import { Lits } from '../models/Lits';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LitsService {
  private apiUrl = 'http://localhost:8080/api/v1/Lits';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddLits';

  constructor(private http: HttpClient) {}

  createLit(Lits: Lits): Observable<Object> {
    return this.http.post<Lits>(`${this.apiUrlAdd}`, Lits);
  }
  getAllLits(): Observable<Lits[]> {
    return this.http.get<Lits[]>(this.apiUrl);
  }
}
