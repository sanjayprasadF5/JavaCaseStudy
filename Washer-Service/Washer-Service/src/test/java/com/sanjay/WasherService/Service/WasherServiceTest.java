package com.sanjay.WasherService.Service;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sanjay.WasherService.Entity.Washer;
import com.sanjay.WasherService.Repository.WasherRepository;

@SpringBootTest
class WasherServiceTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	@Autowired
	WasherService washerService;
	
	@MockBean
	private WasherRepository washerRepository;
	
	@BeforeEach
	void setUp() {
		Washer washer = Washer.builder()
				.washerName("Rahul")
				.washerEmail("123@gmail.com")
				.washerContact("1241323")
				.washerId(1L)
				.build();
		
//		Washer washer = new Washer(1L,"123@gmail.com","1312321","rahul");
		Mockito.when(washerRepository.findByWasherNameIgnoreCase("rahul"))
				.thenReturn(washer);
	}
	
	
	@Test
	public void whenValidWasherName_thenWasherShouldFound() {
		String washerName = "rahul";
		Washer found = washerService.fetchWasherByName(washerName);
		
		assertEquals(washerName, found.getWasherName());
	}

}
