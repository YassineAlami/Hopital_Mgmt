import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListHospitalisationsComponent } from './list-hospitalisations.component';

describe('ListHospitalisationsComponent', () => {
  let component: ListHospitalisationsComponent;
  let fixture: ComponentFixture<ListHospitalisationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListHospitalisationsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListHospitalisationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
