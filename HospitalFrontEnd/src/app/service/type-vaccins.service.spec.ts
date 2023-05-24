import { TestBed } from '@angular/core/testing';

import { TypeVaccinsService } from './type-vaccins.service';

describe('TypeVaccinsService', () => {
  let service: TypeVaccinsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TypeVaccinsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
