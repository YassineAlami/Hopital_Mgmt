import { Injectable } from '@angular/core';
import { Rendez_vous } from '../models/Rendez_vous';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RendezVousService {
  private apiUrl = 'http://localhost:8080/api/v1/RendezVouss';
  private updateUrl = 'http://localhost:8080/api/v1/updateRendezVous';
  private deleteUrl = 'http://localhost:8080/api/v1/DeleteRendezVous';
  private urlgetRdv='http://localhost:8080/api/v1/RendezVous';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddRendezVous';

  constructor(private http: HttpClient) {}
  createRdv(Patient: Rendez_vous): Observable<Object> {
    return this.http.post<Rendez_vous>(`${this.apiUrlAdd}`, Patient);
  }
  updateRdv(id:number,Patient: Rendez_vous): Observable<Object>{
    return this.http.put<Rendez_vous>(`${this.updateUrl}/${id}`,Patient);
  }
  getAllRendez_Vous(): Observable<Rendez_vous[]> {
    return this.http.get<Rendez_vous[]>(this.apiUrl);
  }
  getRdv(id?:number): Observable<Rendez_vous>{
    return this.http.get<Rendez_vous>(`${this.urlgetRdv}/${id}`)
  }
  deleteRdv(id:number): Observable<any>{
    return this.http.delete(`${this.deleteUrl}/${id}`);
  }

}
