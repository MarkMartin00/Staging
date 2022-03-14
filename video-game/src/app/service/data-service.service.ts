import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { apiUrl } from 'src/environments/environment';
import { PokemonMoves } from '../component/pokemon-moves/pokemon-moves.component';
import { PokemonModel } from '../component/pokemon-model/pokemon-model.component';

const url = apiUrl;

@Injectable({
  providedIn: 'root'
})


export class DataServiceService {


  constructor(private httpclient: HttpClient) {
    this.pokemons = [];
  }

  public getPokimon() {
    return this.httpclient.get(`${url}pokemon/`);
  }

  public getSpecificPokimon(a: String) {
    return this.httpclient.get(`${url}pokemon/${a}`);
  }

  public getPokimonId(a: Number) {
      return this.httpclient.get(`${url}pokemon/${a}`);
  }

  public getPokemonMoves(a: String) {
    return this.httpclient.get(`${url}move/${a}`);
  }

}
