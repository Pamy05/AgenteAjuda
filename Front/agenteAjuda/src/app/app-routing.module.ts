import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FamiliaComponent } from './familia/familia.component';
import { HomeComponent } from './home/home.component';
import { ImcComponent } from './imc/imc.component';
import { LocalComponent } from './local/local.component';
import { PostFamiliaComponent } from './post-familia/post-familia.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full'},
  {path:'home', component: HomeComponent},
  {path:'local', component: LocalComponent},
  {path:'familia', component: FamiliaComponent},
  {path:'imc', component: ImcComponent},
  {path: 'cadastroFamilia', component: PostFamiliaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
