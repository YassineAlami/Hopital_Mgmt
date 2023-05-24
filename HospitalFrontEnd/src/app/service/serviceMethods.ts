import { Observable } from "rxjs/internal/Observable";
import { HttpClient } from "@angular/common/http";

export class serviceMethods{

  constructor(private http: HttpClient) {}

  create(objet: Object,url: string): Observable<Object> {
    return this.http.post<Object>(`${url}`, objet);
  }

  getAll(url: string): Observable<Object[]> {
    return this.http.get<Object[]>(url);
  }
}
