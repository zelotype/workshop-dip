package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IdControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void case01(){
        IdResponse response = testRestTemplate.getForObject("/id", IdResponse.class);

        assertEquals("XYZ7", response.getResult());
    }
}