import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { CreateAccountComponent } from './components/navbar/create-account/create-account.component';

const routes: Routes = [
  {path: "", component: HomepageComponent},
  {path: "create-account", component: CreateAccountComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
