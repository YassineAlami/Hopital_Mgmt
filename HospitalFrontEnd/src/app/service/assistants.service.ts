import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Assistants } from '../models/Assistants';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AssistantsService {
  private apiUrl = 'http://localhost:8080/api/v1/Assistants';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddAssistants';

  constructor(private http: HttpClient) {}

  createAssistants(assistants: Assistants): Observable<Object> {
    return this.http.post<Assistants>(`${this.apiUrlAdd}`, Assistants);
  }
  getAllAssistants(): Observable<Assistants[]> {
    return this.http.get<Assistants[]>(this.apiUrl);
  }
}
