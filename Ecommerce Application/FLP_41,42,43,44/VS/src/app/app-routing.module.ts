import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpdateStatusComponent } from './update-status/update-status.component';
import { CheckStatusComponent } from './check-status/check-status.component';
import { RevenueComponent } from './revenue/revenue.component';
import { LoginComponent } from './login/login.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { HistoryComponent } from './history/history.component';
import { CartComponent } from './cart/cart.component';

const routes: Routes = [

  { path: 'update', component: UpdateStatusComponent },
  { path: 'status', component: CheckStatusComponent},
  { path: 'revenue', component: RevenueComponent},
  { path: 'login', component: LoginComponent },
  {path:'customer',component: CustomerLoginComponent},
  {path:'history',component: HistoryComponent},
  {path:'cart',component: CartComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
