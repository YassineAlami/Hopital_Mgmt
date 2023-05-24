import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patients } from '../models/Patients';
@Injectable({
  providedIn: 'root'
})
export class PatientsService {
  private apiUrl = 'http://localhost:8080/api/v1/Patients';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddPatients';
  constructor(private http: HttpClient) {

  }
  createPatient(Patient: Patients): Observable<Object> {
    console.log('atient');
    return this.http.post<Patients>(`${this.apiUrlAdd}`, Patient);
  }
  getAllPatients(): Observable<Patients[]> {
    return this.http.get<Patients[]>(this.apiUrl);
  }
}


