import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DipanshiComponent } from './dipanshi.component';

describe('DipanshiComponent', () => {
  let component: DipanshiComponent;
  let fixture: ComponentFixture<DipanshiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DipanshiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DipanshiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
