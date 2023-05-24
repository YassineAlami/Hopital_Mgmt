import { TestBed } from '@angular/core/testing';

import { ServiceGardeService } from './service-garde.service';

describe('ServiceGardeService', () => {
  let service: ServiceGardeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceGardeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
