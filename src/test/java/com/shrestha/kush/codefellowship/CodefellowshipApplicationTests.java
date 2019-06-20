package com.shrestha.kush.codefellowship;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class CodefellowshipApplicationTests {

	@Autowired
	AppUserController appUserController;

	@Autowired
	CodeFellowshipController codeFellowshipController;

	@Autowired
	PostController postController;


	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {}

	@Test
	public void appControllerIsAutowired() {
		assertNotNull(appUserController);
	}

	@Test
	public void codeFellowShipControllerIsAutowired() {
		assertNotNull(codeFellowshipController);
	}

	@Test
	public void postControllerISAutoWired() {
		assertNotNull(postController);
	}
}
