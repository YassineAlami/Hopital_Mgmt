import { TestBed } from '@angular/core/testing';

import { DossierMedicauxService } from './dossier-medicaux.service';

describe('DossierMedicauxService', () => {
  let service: DossierMedicauxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DossierMedicauxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
