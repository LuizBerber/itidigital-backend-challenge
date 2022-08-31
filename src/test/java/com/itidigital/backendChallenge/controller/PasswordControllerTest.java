package com.itidigital.backendChallenge.controller;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class PasswordControllerTest {

//	private final String URL = "/password/isValid/";
//	private final String PASSWORD = "AbTp9!fok";
//	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
//	
//	@Autowired
//	private MockMvc mvc;
//	
//	@Test
//	public void isValid() throws Exception {
//		
//		RequestDTO dto = new RequestDTO();
//		dto.setPassword(PASSWORD);
//		
//		mvc.perform(MockMvcRequestBuilders
//				.get(URL)
//			    .content(asJsonString(dto))
//				.accept(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk());
//	}
//	
//	public static String asJsonString(final Object obj) {
//	    try {
//	        return new ObjectMapper().writeValueAsString(obj);
//	    } catch (Exception e) {
//	        throw new RuntimeException(e);
//	    }
//	}
}
