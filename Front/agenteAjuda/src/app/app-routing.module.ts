import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroFamiliaComponent } from './cadastro-familia/cadastro-familia.component';
import { FamiliaComponent } from './familia/familia.component';
import { GameComponent } from './game/game.component';
import { HomeComponent } from './home/home.component';
import { ImcComponent } from './imc/imc.component';
import { LocalComponent } from './local/local.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full'},
  {path:'home', component: HomeComponent},
  {path:'local', component: LocalComponent},
  {path:'familia', component: FamiliaComponent},
  {path:'imc', component: ImcComponent},
  {path:'game', component: GameComponent},
  {path: 'cadastro-familia', component: CadastroFamiliaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
