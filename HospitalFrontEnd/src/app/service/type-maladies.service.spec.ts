import { TestBed } from '@angular/core/testing';

import { TypeMaladiesService } from './type-maladies.service';

describe('TypeMaladiesService', () => {
  let service: TypeMaladiesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TypeMaladiesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
