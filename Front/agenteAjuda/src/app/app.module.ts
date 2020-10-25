import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LocalComponent } from './local/local.component';
import { FamiliaComponent } from './familia/familia.component';
import { ImcComponent } from './imc/imc.component';
import { GameComponent } from './game/game.component';
import { CadastroFamiliaComponent } from './cadastro-familia/cadastro-familia.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LocalComponent,
    FamiliaComponent,
    ImcComponent,
    GameComponent,
    CadastroFamiliaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
