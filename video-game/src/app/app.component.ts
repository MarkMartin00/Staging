import { Component } from '@angular/core';
import { PageScrollService } from 'ngx-page-scroll-core';
import { DOCUMENT } from '@angular/common';
import { Inject } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'video-game';
  active = 1;

  constructor(
    private pageScrollServ: PageScrollService,
    @Inject(DOCUMENT) private document: any
  ) { }

  // this.readUrl(this.pokemons[0].Type1);

  onScroll(event: HTMLElement, i) {
    this.pageScrollServ.scroll({
      scrollTarget: event,
      document: this.document
    });
    this.active = i;
  }
}
