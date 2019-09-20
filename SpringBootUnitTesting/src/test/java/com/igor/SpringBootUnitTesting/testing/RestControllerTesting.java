package com.igor.SpringBootUnitTesting.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.igor.SpringBootUnitTesting.rest.MyController;

@RunWith(SpringRunner.class)
public class RestControllerTesting {

	private MockMvc mockMvc;
	
	@InjectMocks
	private MyController myController;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
	}

	@Test
	public void test() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/myController/greet"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello World!"));
	}
	

	
	

}
