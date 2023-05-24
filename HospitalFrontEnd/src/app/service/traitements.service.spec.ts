import { TestBed } from '@angular/core/testing';

import { TraitementsService } from './traitements.service';

describe('TraitementsService', () => {
  let service: TraitementsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TraitementsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
