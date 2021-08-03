package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class GeneratedIdServiceTest {

    @Autowired
    private GeneratedIdService generatedIdService;

    @MockBean
    private Random random;

    @Test
    public void case01() {
        when(random.nextInt(anyInt())).thenReturn(7);

        String id = generatedIdService.get();

        assertEquals("XYZ7", id);
    }
}