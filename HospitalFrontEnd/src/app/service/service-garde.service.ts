import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Service_de_Gardes } from '../models/Service_de_garde';

@Injectable({
  providedIn: 'root'
})
export class ServiceGardeService {

  private apiUrl = 'http://localhost:8080/api/v1/Service_de_Gardes';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddPService_de_Gardes';
  constructor(private http: HttpClient) {

  }
  createServiceGarde(Patient: Service_de_Gardes): Observable<Object> {
    return this.http.post<Service_de_Gardes>(`${this.apiUrlAdd}`, Patient);
  }
  getAllServiceGarde(): Observable<Service_de_Gardes[]> {
    return this.http.get<Service_de_Gardes[]>(this.apiUrl);
  }
}
