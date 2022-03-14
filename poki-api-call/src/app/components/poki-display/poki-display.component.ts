import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/service/data-service.service';

@Component({
  selector: 'poki-display',
  templateUrl: './poki-display.component.html',
  styleUrls: ['./poki-display.component.css']
})

export class PokiDisplayComponent implements OnInit {
  http: any;
  Results: any[] = [];
  numSearch: Number = 0;
  idSearch: String = "";

  //We are finding pokemon by Id by pinging the API and returning a JSON string
  findId(a: Number) {
    this.dataserv.getPokimonId(a).subscribe((Response : any) => {
      if (Response) {
        //do we want to do anything if we get a successful response? Pleace that here.
      }
      console.log(Response);
      console.log(this.Results.push(Response));
    })
  }

  //We are finding pokemon by Name by pinging the API and returning a JSON string
  findName(n: String) {
    this.dataserv.getSpecificPokimon(n).subscribe((Response : any) => {
      if (Response) {
        //do we want to do anything if we get a successful response? Pleace that here.
      }
      console.log(Response);
      console.log(this.Results.push(Response));
    })
  }

  constructor(private dataserv: DataServiceService) {

  }

  ngOnInit(): void {
  }

}


