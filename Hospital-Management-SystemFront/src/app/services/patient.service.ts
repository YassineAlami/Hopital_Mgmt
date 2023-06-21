import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patients } from '../models/Patients';


@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private apiUrl = 'http://localhost:8080/api/v1/Patients';
  private updateUrl = 'http://localhost:8080/api/v1/updatePatients';
  private deleteUrl = 'http://localhost:8080/api/v1/DeletePatients';
  private urlgetPatient='http://localhost:8080/api/v1/Patients';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddPatients';

  constructor(private http: HttpClient) {}
  createPatient(Patient: Patients): Observable<Object> {
    return this.http.post<Patients>(`${this.apiUrlAdd}`, Patient);
  }
  updatePatient(id:number,Patient: Patients): Observable<Object>{
    return this.http.put<Patients>(`${this.updateUrl}/${id}`,Patient);
  }
  getAllPatients(): Observable<Patients[]> {
    return this.http.get<Patients[]>(this.apiUrl);
  }
  getPatient(id?:number): Observable<Patients>{
    return this.http.get<Patients>(`${this.urlgetPatient}/${id}`)
  }
  deletePatient(id:number): Observable<any>{
    return this.http.delete(`${this.deleteUrl}/${id}`);
  }

}
