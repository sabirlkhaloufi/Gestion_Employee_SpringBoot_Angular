import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  users:any;
  constructor(private http:HttpClient,private router:Router) { 
    this.http.get('http://localhost:3000/Users').subscribe(data=>{
      this.users=data;
    });
  }

  ngOnInit(): void {

  }
  login(form: any){
    this.users.forEach((user: { username: any; }) => {
      if(user.username == form.value.username){
        console.log(user.username);
        this.router.navigate(['/dashboard']);
      }
    });
  }

}
