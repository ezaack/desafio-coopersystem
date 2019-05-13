import { CEP } from './model/cep.model';
import { BASE_URL } from './../constantes';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CepService {

  private headers: HttpHeaders;

  constructor(
    public http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers = this.headers.append('Content-Type', 'application/json');
    this.headers = this.headers.append('Authorization', sessionStorage.getItem('auth'));

  }

  protected getResourceUrl() {
    return `${BASE_URL}/rest/cep/`;
  }

  public get(cep: string): Observable<any> {
    return this.http.get<CEP>(
      this.getResourceUrl() + cep,
      { headers: this.headers, observe: 'response' }
    );
  }
}
