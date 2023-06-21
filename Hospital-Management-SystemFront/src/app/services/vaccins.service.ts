import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vaccins } from '../models/Vaccins';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VaccinsService {

  private apiUrl = 'http://localhost:8080/api/v1/Vaccins';
  private updateUrl = 'http://localhost:8080/api/v1/updateVaccins';
  private deleteUrl = 'http://localhost:8080/api/v1/DeleteVaccins';
  private urlgetVaccin='http://localhost:8080/api/v1/Vaccins';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddVaccins';

  constructor(private http: HttpClient) {}

  createVaccin(Vaccin: Vaccins): Observable<Object> {
    return this.http.post<Vaccins>(`${this.apiUrlAdd}`, Vaccin);
  }
  updateVaccin(id:number,Vaccin: Vaccins): Observable<Object>{
    return this.http.put<Vaccins>(`${this.updateUrl}/${id}`,Vaccin);
  }
  getAllVaccins(): Observable<Vaccins[]> {
    return this.http.get<Vaccins[]>(this.apiUrl);
  }
  getVaccin(id?:number): Observable<Vaccins>{
    return this.http.get<Vaccins>(`${this.urlgetVaccin}/${id}`)
  }
  deleteVaccin(id:number): Observable<any>{
    return this.http.delete(`${this.deleteUrl}/${id}`);
  }

}
