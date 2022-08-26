import { TestBed } from '@angular/core/testing';

import { ServExperienciaService } from './serv-experiencia.service';

describe('ServExperienciaService', () => {
  let service: ServExperienciaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServExperienciaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
