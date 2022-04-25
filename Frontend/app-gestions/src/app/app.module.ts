import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { CompteDisableComponent } from './components/compte-disable/compte-disable.component';
import { DashboardadminComponent } from './components/dashboardadmin/dashboardadmin.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AddemployeComponent } from './components/addemploye/addemploye.component';
import { ListemployeComponent } from './components/listemploye/listemploye.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    CompteDisableComponent,
    DashboardadminComponent,
    NavbarComponent,
    AddemployeComponent,
    ListemployeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      { path: '' , component:LoginPageComponent  },
      { path: 'disable', component:CompteDisableComponent },
      { path: 'dashboard', component:DashboardadminComponent },
      { path: 'dashboard/listemploye', component:ListemployeComponent },
      { path: 'dashboard/addemploye', component:AddemployeComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


// .forRoot([
//   {path: 'login', component: LoginPageComponent},
//   {path: 'compteDisable', component:CompteDisableComponent},
// ]),
// ],
