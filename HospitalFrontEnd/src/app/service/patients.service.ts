import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patients } from '../models/Patients';
@Injectable({
  providedIn: 'root'
})
export class PatientsService {
  private apiUrl = 'http://localhost:8080/api/v1/Patients';

  constructor(private http: HttpClient) {

  }
  getAllPatients(): Observable<Patients[]> {
    return this.http.get<Patients[]>(this.apiUrl);
  }
}


