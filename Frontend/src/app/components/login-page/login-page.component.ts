import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';
import { catchError, pipe } from 'rxjs';
@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  
  constructor(private http:HttpClient
              ,private router:Router
              ,private loginService:LoginService) { 

  }

  ngOnInit(): void {

  }
  login(form: any){
 

    this.loginService.login(form).subscribe(e=>{
      console.log(e);
    })
  }

}
