package com.sip.ams.controllers;
import static org.hamcrest.CoreMatchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
import org.junit.jupiter.api.Test; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

	@WebMvcTest
	public class TestFirstController {
		
		@Autowired
		private MockMvc mockMvc;
		
		@Test
		public void Test1_home() throws Exception {
			this.mockMvc.perform(get("/first/home")).andExpect(status().isOk())
			 .andExpect(content().string(containsString("BMW")));
		}
		
		@Test
		public void Test2_home() throws Exception {
			this.mockMvc.perform(get("/first/home")).andExpect(status().isOk())
			 .andExpect(content().string(containsString("Mazda")));
		}
		
		@Test
		public void Test3_home() throws Exception {
			this.mockMvc.perform(get("/first/home")).andExpect(status().isOk())
			.andExpect(content().string(containsString("framework")));
		}
		
}