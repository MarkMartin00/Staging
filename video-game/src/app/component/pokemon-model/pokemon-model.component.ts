import { Component, Inject, OnInit } from '@angular/core';

@Component({
  selector: 'pokemon-model',
  templateUrl: './pokemon-model.component.html',
  styleUrls: ['./pokemon-model.component.css']
})
export class PokemonModel implements OnInit {

  PokeId: number;
  Name: string;
  Type1: string;
  Type2: string;
  Moves: string;
  Stats: string;
  SpritesFrontDefault: string;
  SpritesBackDefault: string;
  SpritesFrontShiny: string;
  SpritesBackShiny: string;

  constructor(@Inject(String) PokeId: number, @Inject(String) Name: string, @Inject(String) Type1: string,  @Inject(String) Type2: string, @Inject(String) Moves: string, @Inject(String)
    Stats: string, @Inject(String) SpritesFrontDefault: string, @Inject(String) SpritesBackDefault: string, @Inject(String) SpritesFrontShiny: string,
    @Inject(String) SpritesBackShiny: string) {
    this.PokeId = PokeId,
    this.Name = Name.toUpperCase(),
    this.Type1 = Type1.toUpperCase(),
    this.Type2 = Type2.toUpperCase(),
    this.Moves = Moves,
    this.Stats = Stats,
    this.SpritesFrontDefault = SpritesFrontDefault,
    this.SpritesBackDefault = SpritesBackDefault,
    this.SpritesFrontShiny = SpritesFrontShiny,
    this.SpritesBackShiny = SpritesBackShiny
   }

  ngOnInit(): void {
  }

}
