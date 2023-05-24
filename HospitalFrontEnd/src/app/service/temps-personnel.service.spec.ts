import { TestBed } from '@angular/core/testing';

import { TempsPersonnelService } from './temps-personnel.service';

describe('TempsPersonnelService', () => {
  let service: TempsPersonnelService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TempsPersonnelService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
