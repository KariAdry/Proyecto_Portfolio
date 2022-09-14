import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevaInstruccionComponent } from './nueva-instruccion.component';

describe('NuevaInstruccionComponent', () => {
  let component: NuevaInstruccionComponent;
  let fixture: ComponentFixture<NuevaInstruccionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NuevaInstruccionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NuevaInstruccionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
