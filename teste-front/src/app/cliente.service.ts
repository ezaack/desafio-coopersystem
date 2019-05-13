import { HttpHeaders, HttpClient } from '@angular/common/http';
import { BASE_URL } from './../constantes';
import { Cliente } from './model/cliente.model';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private headers: HttpHeaders;

  constructor(
    public http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers = this.headers.append('Content-Type', 'application/json');
    this.headers = this.headers.append('Authorization', sessionStorage.getItem('auth'));

  }

  protected getResourceUrl() {
    return `${BASE_URL}/rest/cliente`;
  }
  public post(cliente: Cliente): Observable<any> {
    return this.http.post<Cliente>(
      this.getResourceUrl(),
      cliente,
      { headers: this.headers, observe: 'response' }
    );
  }

  public put(cliente: Cliente): Observable<any> {
    return this.http.put<Cliente>(
      this.getResourceUrl(),
      cliente,
      { headers: this.headers, observe: 'response' }
    );
  }

  public getOne(id: number): Observable<any> {
    return this.http.get<Cliente>(
      this.getResourceUrl() + '/' + id,
      { headers: this.headers, observe: 'response' }
    );
  }
  public getAll(): Observable<any> {
    return this.http.get<Cliente>(
      this.getResourceUrl(),
      { headers: this.headers, observe: 'response' }
    );
  }
}
