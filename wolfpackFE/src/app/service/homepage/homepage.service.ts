import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmailValidator } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class HomepageService {
  private apiServerUrl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  newClient(email: String): Observable<any> { 
    return this.http.post<any>(`${this.apiServerUrl}/register`, email, {responseType: 'text' as 'json'});
  }
}

