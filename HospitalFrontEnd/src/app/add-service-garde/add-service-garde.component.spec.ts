import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddServiceGardeComponent } from './add-service-garde.component';

describe('AddServiceGardeComponent', () => {
  let component: AddServiceGardeComponent;
  let fixture: ComponentFixture<AddServiceGardeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddServiceGardeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddServiceGardeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
