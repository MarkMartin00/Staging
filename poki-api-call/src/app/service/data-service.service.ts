import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { apiUrl } from 'src/environments/environment';

const url = apiUrl;

@Injectable({
  providedIn: 'root'
})


export class DataServiceService {

  constructor(private httpclient: HttpClient) {
  }

  public getPokimon() {
    return this.httpclient.get('${url}pokemon/');
  }

  public getSpecificPokimon(a: String) {
    return this.httpclient.get('${url}pokemon/${a}');
  }

  public getPokimonId(a: Number) {
    return this.httpclient.get('${url}pokemon/${a}');
  }


}
