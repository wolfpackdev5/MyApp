import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CreateAccountService {
  //methods needed: send to back end post mapping a new account 
  private apiServerUrl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  newAccount(email: string, firstName: string, lastName: string, bio: string,
    age: number, weight: number): Observable<any> {
      return this.http.post<any>(`${this.apiServerUrl}/createAccount`, {responseType: 'text' as 'json'});
    }
}
