import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfirmRendezVousComponent } from './confirm-rendez-vous.component';

describe('ConfirmRendezVousComponent', () => {
  let component: ConfirmRendezVousComponent;
  let fixture: ComponentFixture<ConfirmRendezVousComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfirmRendezVousComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConfirmRendezVousComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
