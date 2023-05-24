import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Service_de_Gardes } from '../models/Service_de_garde';

@Injectable({
  providedIn: 'root'
})
export class ServiceGardeService {

  private apiUrl = 'http://localhost:8080/api/v1/ServicesGardes';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddServicesGardes';
  constructor(private http: HttpClient) {

  }
  createServiceGarde(ServicesGardes: Service_de_Gardes): Observable<Object> {
    return this.http.post<Service_de_Gardes>(`${this.apiUrlAdd}`, ServicesGardes);
  }
  getAllServiceGarde(): Observable<Service_de_Gardes[]> {
    return this.http.get<Service_de_Gardes[]>(this.apiUrl);
  }
}
