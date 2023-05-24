import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Scanners } from '../models/Scanners';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ScannersService {
  private apiUrl = 'http://localhost:8080/api/v1/Scanners';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddScanners';

  constructor(private http: HttpClient) {}

  createScanners(Scanners: Scanners): Observable<Object> {
    return this.http.post<Scanners>(`${this.apiUrlAdd}`, Scanners);
  }
  getAllScanners(): Observable<Scanners[]> {
    return this.http.get<Scanners[]>(this.apiUrl);
  }
}
