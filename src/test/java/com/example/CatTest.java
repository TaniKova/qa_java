package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Mock
    Feline felineMock;

    @Before
    public void initCat() {
        cat = new Cat(felineMock);
    }

    @Test
    public void getSound() {
        assertEquals("Should return Мяу", cat.getSound(), "Мяу");
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Should return list of meat", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}