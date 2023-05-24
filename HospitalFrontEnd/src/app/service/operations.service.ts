import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Operations } from '../models/Operations';
import { Observable } from 'rxjs/internal/Observable';


@Injectable({
  providedIn: 'root'
})
export class OperationsService {

  private apiUrl = 'http://localhost:8080/api/v1/Operations';
  private apiUrlAdd = 'http://localhost:8080/api/v1/AddOperations';

  constructor(private http: HttpClient) {}

  createOperations(Operations: Operations): Observable<Object> {
    return this.http.post<Operations>(`${this.apiUrlAdd}`, Operations);
  }
  getAllOperations(): Observable<Operations[]> {
    return this.http.get<Operations[]>(this.apiUrl);
  }
}
