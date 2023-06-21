package com.hopital;

import com.hopital.repo.IVaccin;
import com.hopital.service.VaccinService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HopitalV1ApplicationTests {

	IVaccin vaccin;
	VaccinService service=new VaccinService(vaccin);

	@Test
	void contextLoads() {
	}

}
