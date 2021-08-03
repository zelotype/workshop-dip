package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GeneratedIdServiceUnitTest {

    @Mock
    private Random random;

    @Test
    public void case01() {
        when(random.nextInt(anyInt())).thenReturn(7);
        GeneratedIdService generatedIdService = new GeneratedIdService();
        generatedIdService.setRandom(random);

        String id = generatedIdService.get();
        
        assertEquals("XYZ7", id);
    }
}
