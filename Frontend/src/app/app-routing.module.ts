import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { CompteDisableComponent } from './components/compte-disable/compte-disable.component';
import { DashboardadminComponent } from './components/dashboardadmin/dashboardadmin.component';
import { ListemployeComponent } from './components/listemploye/listemploye.component';
import { AddemployeComponent } from './components/addemploye/addemploye.component';


const routes: Routes = [
  { path: '' , component:LoginPageComponent  },
  { path: 'disable', component:CompteDisableComponent },
  { path: 'dashboard', component:DashboardadminComponent },
  { path: 'dashboard/list', component:ListemployeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
