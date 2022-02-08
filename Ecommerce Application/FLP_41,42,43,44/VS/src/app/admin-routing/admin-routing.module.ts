import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { CustomerLoginComponent } from '../customer-login/customer-login.component';
const routes: Routes = [

  { path: 'login', component: LoginComponent },
  {path:'customer',component: CustomerLoginComponent}
 
];
@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class AdminRoutingModule { }
