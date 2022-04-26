import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { pipe,catchError } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) {
   }

   login(form:any){
    const headers = new HttpHeaders({
      'Content-Type': 'application/x-www-form-urlencoded'
    });
    const body = new HttpParams()
    .set('username', form.username)
    .set('password', form.password)
     return this.http.post("http://localhost:8080/login",body,{headers:headers});
   }
}
