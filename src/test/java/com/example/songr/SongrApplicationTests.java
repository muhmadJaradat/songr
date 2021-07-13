package com.example.songr;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(SpringExtension.class)

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	MockMvc mockMvc;


	@Test
	void helloTest() throws Exception {
//
		mockMvc.perform(get("/hello"))
				.andExpect(content().string(containsString("<h1>Hello World</h1>")))
				.andExpect(status().isOk());
	}
}
