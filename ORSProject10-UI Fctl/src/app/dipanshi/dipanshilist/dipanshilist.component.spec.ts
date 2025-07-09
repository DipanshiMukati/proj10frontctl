import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DipanshilistComponent } from './dipanshilist.component';

describe('DipanshilistComponent', () => {
  let component: DipanshilistComponent;
  let fixture: ComponentFixture<DipanshilistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DipanshilistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DipanshilistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
