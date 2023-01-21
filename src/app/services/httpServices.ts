import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
  
export class HttpService {
  constructor(private http: HttpClient) { }

  public saveResponse(req:any) :Observable<any>{
    return this.http.post("http://localhost:8080/questions", req);
  }
}