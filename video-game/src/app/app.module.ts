import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchbarComponent } from './component/searchbar/searchbar.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { PokemonModel } from './component/pokemon-model/pokemon-model.component';
import { PokemonMoves } from './component/pokemon-moves/pokemon-moves.component';
import { NgxPageScrollCoreModule } from 'ngx-page-scroll-core';



@NgModule({
  declarations: [
    AppComponent,
    SearchbarComponent,
    PokemonModel,
    PokemonMoves
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    NgxPageScrollCoreModule.forRoot({
      duration: 1500
    }),

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
