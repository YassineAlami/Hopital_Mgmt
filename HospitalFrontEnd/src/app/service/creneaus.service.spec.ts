import { TestBed } from '@angular/core/testing';

import { CreneausService } from './creneaus.service';

describe('CreneausService', () => {
  let service: CreneausService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreneausService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
