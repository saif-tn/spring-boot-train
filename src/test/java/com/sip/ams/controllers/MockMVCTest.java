//package com.sip.ams.controllers;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//	public class MockMVCTest {
//
//	    private MockMvc mockMvc;
//
//	    @Before
//	    public void setup() {
//	        this.mockMvc = MockMvcBuilders.standaloneSetup(new MyController()).build();
//	    }
//
//	    @Test
//	    public void testHomePage() throws Exception {
//	        this.mockMvc.perform(get("/"))
//	                .andExpect(status().isOk())
//	                .andExpect(view().name("index"))
//	                .andDo(MockMvcResultHandlers.print())
//	                .andReturn();
//	    }
//
//	    @Test
//	    public void testMessagePage() throws Exception {
//	        this.mockMvc.perform(get("/message")).andExpect(status().isOk())
//	                .andExpect(content().string("Hello there!"));
//	    }
//	}