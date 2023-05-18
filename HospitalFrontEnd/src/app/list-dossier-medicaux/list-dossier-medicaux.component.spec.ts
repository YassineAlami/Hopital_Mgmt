import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDossierMedicauxComponent } from './list-dossier-medicaux.component';

describe('ListDossierMedicauxComponent', () => {
  let component: ListDossierMedicauxComponent;
  let fixture: ComponentFixture<ListDossierMedicauxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListDossierMedicauxComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListDossierMedicauxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
