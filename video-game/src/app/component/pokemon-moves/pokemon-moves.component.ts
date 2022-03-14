import { PercentPipe } from '@angular/common';
import { Component, Inject, OnInit } from '@angular/core';

@Component({
  selector: 'pokemon-moves',
  templateUrl: './pokemon-moves.component.html',
  styleUrls: ['./pokemon-moves.component.css']
})
export class PokemonMoves implements OnInit {

  Move: string;
  Accuracy: string;
  Type: string;
  Power: number;
  PPnumber: number;
  Priority: number;
  Target: string;
  EffectChance: PercentPipe;
  Effect: string;
  ShortEffect: string;

  constructor(@Inject(String) Move: string, @Inject(String) Accuracy: string, @Inject(String) Type: string,
    @Inject(String) Power: number, @Inject(String) PPnumber: number, @Inject(String) Priority: number,
    @Inject(String) Target: string, @Inject(String) EffectChance: PercentPipe, @Inject(String) Effect: string,
    @Inject(String) ShortEffect: string) {
      this.Move = Move.toUpperCase(),
      this.Accuracy = Accuracy,
      this.Type = Type.toUpperCase(),
      this.Power = Power,
      this.PPnumber = PPnumber,
      this.Priority = Priority,
      this.Target = Target.toUpperCase(),
      this.EffectChance = EffectChance,
      this.Effect = Effect,
      this.ShortEffect = ShortEffect
   }

  ngOnInit(): void {

  }

}
