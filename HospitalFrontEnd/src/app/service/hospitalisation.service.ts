import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Hospitalisations } from '../models/Hospitalistations';

@Injectable({
  providedIn: 'root'
})
export class HospitalisationService {
  private apiUrl = 'http://localhost:8080/api/v1/Hospitalisations';

  constructor(private http: HttpClient) {

  }
  getAllHospitalisations(): Observable<Hospitalisations[]> {
    return this.http.get<Hospitalisations[]>(this.apiUrl);
  }
}
