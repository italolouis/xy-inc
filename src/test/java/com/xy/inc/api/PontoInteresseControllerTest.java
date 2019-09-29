package com.xy.inc.api;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.xy.inc.api.controller.PontoInteresseController;

public class PontoInteresseControllerTest extends XyIncApplicationTests{
	private MockMvc mockMvc;
	
	@Autowired
	private PontoInteresseController pontoInteresseController;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(pontoInteresseController).build();
	}
	
	@Test
	public void testGETSavePontosInteresseController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.post("/pontosInteresse"))
			.andExpect(MockMvcResultMatchers.model().attributeExists("nome"))	
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testGETPontosInteresseController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/pontosInteresse")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testGETPontosProximosController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/pontosInteresse/buscarPontosProximo")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
