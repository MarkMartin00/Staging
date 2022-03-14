import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PokiDisplayComponent } from './poki-display.component';

describe('PokiDisplayComponent', () => {
  let component: PokiDisplayComponent;
  let fixture: ComponentFixture<PokiDisplayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PokiDisplayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PokiDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
