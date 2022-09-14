import {  NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditarEducacionComponent } from './components/educacion/editar-educacion.component';
import { NuevaInstruccionComponent } from './components/educacion/nueva-instruccion.component';
import { EdicionExperienciaComponent } from './components/experiencia-laboral/edicion-experiencia.component';
import { NuevaExperienciaComponent } from './components/experiencia-laboral/nueva-experiencia.component';
import { LoginComponent } from './components/login/login.component';
import { PortfolioComponent } from './components/portfolio/portfolio.component';

const routes: Routes = 
[
{path:'', component: PortfolioComponent},
{path:'login', component:LoginComponent},
{path:'exp',component:NuevaExperienciaComponent},
{path:'editexp/:id',component:EdicionExperienciaComponent},
{path:'educa', component:NuevaInstruccionComponent}, 
{path:'edition/:id',component:EditarEducacionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
