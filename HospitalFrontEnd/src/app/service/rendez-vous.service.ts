import { Injectable } from '@angular/core';
import { Rendez_vous } from '../models/Rendez_vous';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RendezVousService {
  private apiUrl = 'http://localhost:8080/api/v1/RendezVous';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddRendezVous';

  constructor(private http: HttpClient) {}

  createRendezvous(RendezVous: Rendez_vous): Observable<Object> {
    return this.http.post<Rendez_vous>(`${this.apiUrlAdd}`, RendezVous);
  }

  getAllRendezvous(): Observable<Rendez_vous[]> {
    return this.http.get<Rendez_vous[]>(this.apiUrl);
  }
}
