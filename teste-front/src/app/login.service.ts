import { BASE_URL } from './../constantes';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private headers: HttpHeaders;

  constructor(
    public http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers = this.headers.append('Content-Type', 'application/json');

  }

  protected getResourceUrl() {
    return BASE_URL;
  }
  public login(email: string, senha: string): Observable<any> {
    return this.http.post(this.getResourceUrl() + '/login',
      {
        'username': email,
        'password': senha
      },
      { headers: this.headers, observe: 'response' }
    );
  }
}
