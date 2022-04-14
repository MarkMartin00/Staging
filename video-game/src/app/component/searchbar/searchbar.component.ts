import { Component, OnInit } from '@angular/core';
import { timeout } from 'rxjs';
import { DataServiceService } from 'src/app/service/data-service.service';
import { PokemonModel } from '../pokemon-model/pokemon-model.component';
import { PokemonMoves } from '../pokemon-moves/pokemon-moves.component';

@Component({
  selector: 'searchbar',
  templateUrl: './searchbar.component.html',
  styleUrls: ['./searchbar.component.css'],
})
export class SearchbarComponent implements OnInit {
  //pulling service into searchbar component
  constructor(public dataserv: DataServiceService) {
    this.dataserv.displayShiny;
  }

  //switch display between shiny and non shiny
  public switchDisplay() {
    if (this.dataserv.displayShiny) {
      this.dataserv.displayShiny = false;
    } else {
      this.dataserv.displayShiny = true;
    }
  }

  ngOnInit(): void {
    //load an initial pokemon
    this.findId(1);
  }

  //this promise fixes a load bug from not having an initial binding reference
  filtersLoaded: Promise<boolean>;
  filtersLoaded2: Promise<boolean>;
  http: any;
  //string used for page load out.
  pokemons: any[] = [];
  moves: any[] = [];
  name = 'Angular';
  numSearch: Number = 0;
  idSearch: String = '';
  active = 1;
  ability1: String;
  ability2: String;
  ability3: String;
  ability4: String;
  selectedProject: String = 'Choose an Option';

  //find the moves chosen in the list.
  findMoves(
    ability1: String,
    ability2: String,
    ability3: String,
    ability4: String
  ) {
    this.filtersLoaded2 = Promise.resolve(false);
    let moves: any[] = [ability1, ability2, ability3, ability4];
    let i = 5;
    moves.forEach((move) => {
      this.dataserv.getPokemonMoves(move.toLowerCase()).subscribe(
        (response: any) => {
          const a = new PokemonMoves(
            response.name,
            ifAccuracy(response.accuracy),
            response.type.name,
            ifAccuracy(response.power),
            ifAccuracy(response.pp),
            response.priority,
            response.target.name,
            ifAccuracy(response.effect_chance),
            ifAccuracy(response.effect_entries[0].effect),
            response.effect_entries[0].short_effect
          );
          this.moves[i] = a;
          i += 1;
        },
        (error) => {
          console.error(error);
        }
      );
    });
    this.filtersLoaded2 = Promise.resolve(true);
  }

  //We are finding pokemon by Id by pinging the API and returning a JSON string
  findId(a: Number) {
    this.dataserv.getPokimonId(a).subscribe((response: any) => {
      if (response) {
        //do we want to do anything if we get a successful response? Place that here.
      }
      try {
        //deletes previous searched string unless the string is saved from a button to a specific string index.
        this.filtersLoaded = Promise.resolve(false);
        this.filtersLoaded2 = Promise.resolve(false);
        this.pokemons.splice(0, 9);
        this.moves.splice(0, 400);
      } finally {
        if (response.types.length > 1) {
          //if the response has more than 1 type, it adds & to the start of the second type and places it in the reference for the html
          let z = ' & ' + response.types[1].type.name;
          console.log(response); //see the entire pokemon response.
          //we create a variable with the constructor from pokemonmodel even though we could just push it in one line.
          const x = new PokemonModel(
            response.id,
            response.name,
            response.types[0].type.name,
            z,
            response.moves,
            response.stats,
            response.sprites.front_default,
            response.sprites.back_default,
            response.sprites.front_shiny,
            response.sprites.back_shiny
          );
          this.pokemons.push(x); //push the code into pokemon string for html

          this.dataserv
            .getPokemonMoves(response.moves[0].move.name)
            .subscribe((response1: any) => {
              if (response1) {
                console.log(response1);
                const m = new PokemonMoves(
                  response1.name,
                  response1.accuracy,
                  response1.type.name,
                  response1.power,
                  response1.pp,
                  response1.priority,
                  response1.target.name,
                  response1.effect_chance,
                  response1.effect_entries[0].effect,
                  response1.effect_entries[0].short_effect
                );
                this.moves.push(m); //push the code into moves string for html
              }
            });

          //We are also creating a movies array list of all the moves available to this object.
        } else {
          //this is if the pokemon response only has 1 type. log the response
          console.log(response);
          const x = new PokemonModel(
            response.id,
            response.name,
            response.types[0].type.name,
            '',
            response.moves,
            response.stats,
            response.sprites.front_default,
            response.sprites.back_default,
            response.sprites.front_shiny,
            response.sprites.back_shiny
          );
          //We are also creating a movies array list of all the moves available to this object.
          this.pokemons.push(x); //push the code into pokemon string for html
          this.dataserv
            .getPokemonMoves(response.moves[0].move.name)
            .subscribe((response1: any) => {
              if (response1) {
                const m = new PokemonMoves(
                  response1.name,
                  response1.accuracy,
                  response1.type.name,
                  response1.power,
                  response1.pp,
                  response1.priority,
                  response1.target.name,
                  response1.effect_chance,
                  response1.effect_entries[0].effect,
                  response1.effect_entries[0].short_effect
                );
                this.moves.push(m); //push the code into moves string for html
              }
            });
        }
        //takes the first type and sends it to the service to change the dynamic CSS based on the type.
        document.body.classList.remove(document.body.classList[0]);
        document.body.classList.add(this.pokemons[0].Type1.toLowerCase());
        console.log(this.pokemons[0].Type1.toLowerCase());
        //makes the intial type on load not shiny
        this.dataserv.displayShiny = false;
        //resets the numsearch/ forms
        this.numSearch = null;
        this.idSearch = null;
        //the promise for fixing the load bug
        this.filtersLoaded = Promise.resolve(true);
        //log the string of the pokemon used in the html.
        console.log(this.pokemons);
        console.log(this.moves);
      }
    });
  }

  //We are finding pokemon by Name by pinging the API and returning a JSON string
  findName(n: String) {
    this.dataserv
      .getSpecificPokimon(n.toLowerCase())
      .subscribe((response: any) => {
        if (response) {
          //do we want to do anything if we get a successful response? Place that here.
        }
        try {
          this.filtersLoaded2 = Promise.resolve(false);
          this.filtersLoaded = Promise.resolve(false);
          this.pokemons.splice(0, 9);
          this.moves.splice(0, 10);
        } finally {
          if (response.types.length > 1) {
            let z = ' & ' + response.types[1].type.name;
            console.log(response);
            const x = new PokemonModel(
              response.id,
              response.name,
              response.types[0].type.name,
              z,
              response.moves,
              response.stats,
              response.sprites.front_default,
              response.sprites.back_default,
              response.sprites.front_shiny,
              response.sprites.back_shiny
            );
            this.pokemons.push(x); //push the code into pokemon string for html
            //We are also creating a movies array list of all the moves available to this object.
            this.dataserv
              .getPokemonMoves(response.moves[0].move.name)
              .subscribe((response1: any) => {
                if (response1) {
                  console.log(response1);
                  const m = new PokemonMoves(
                    response1.name,
                    response1.accuracy,
                    response1.type.name,
                    response1.power,
                    response1.pp,
                    response1.priority,
                    response1.target.name,
                    response1.effect_chance,
                    response1.effect_entries[0].effect,
                    response1.effect_entries[0].short_effect
                  );
                  this.moves.push(m); //push the code into moves string for html
                }
              });
          } else {
            console.log(response);
            const x = new PokemonModel(
              response.id,
              response.name,
              response.types[0].type.name,
              '  ',
              response.moves,
              response.stats,
              response.sprites.front_default,
              response.sprites.back_default,
              response.sprites.front_shiny,
              response.sprites.back_shiny
            );
            this.pokemons.push(x); //push the code into pokemon string for html
            //We are also creating a movies array list of all the moves available to this object.
            this.dataserv
              .getPokemonMoves(response.moves[0].move.name)
              .subscribe((response1: any) => {
                if (response1) {
                  console.log(response1);
                  const m = new PokemonMoves(
                    response1.name,
                    response1.accuracy,
                    response1.type.name,
                    response1.power,
                    response1.pp,
                    response1.priority,
                    response1.target.name,
                    response1.effect_chance,
                    response1.effect_entries[0].effect,
                    response1.effect_entries[0].short_effect
                  );
                  this.moves.push(m); //push the code into moves string for html
                }
              });
          }
          document.body.classList.remove(document.body.classList[0]);
          document.body.classList.add(this.pokemons[0].Type1.toLowerCase());
          this.dataserv.displayShiny = false;
          this.idSearch = null;
          this.numSearch = null;
          this.filtersLoaded = Promise.resolve(true);
          console.log(this.pokemons);
          console.log(this.moves);
        }
      });
  }
}

function ifAccuracy(accuracy: any) {
  if (accuracy) {
    return accuracy;
  } else {
    return 'N/A';
  }
}
