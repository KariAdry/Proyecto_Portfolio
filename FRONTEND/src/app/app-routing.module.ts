import {  NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EdicionExperienciaComponent } from './components/experiencia-laboral/edicion-experiencia.component';
import { NuevaExperienciaComponent } from './components/experiencia-laboral/nueva-experiencia.component';
import { LoginComponent } from './components/login/login.component';
import { PortfolioComponent } from './components/portfolio/portfolio.component';

const routes: Routes = 
[
{path:'', component: PortfolioComponent},
{path:'login', component:LoginComponent},
{path:'exp',component:NuevaExperienciaComponent},
{path:'editexp/:id',component:EdicionExperienciaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
