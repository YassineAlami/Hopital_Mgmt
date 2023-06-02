import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admins } from '../models/admins';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AdminsService {

  private apiUrl = 'http://localhost:8080/api/v1/Admins';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddAdmins';

  constructor(private http: HttpClient) {}

  createAdmins(admins: Admins): Observable<Object> {
    return this.http.post<Admins>(`${this.apiUrlAdd}`, Admins);
  }

  getAllAdmins(): Observable<Admins[]> {
    return this.http.get<Admins[]>(this.apiUrl);
  }
}
