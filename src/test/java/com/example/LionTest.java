package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline felineMock;
    public Lion lionMale;

    @Before
    public void initLion() throws Exception {
        lionMale = new Lion(felineMock, "Male");
    }

    @Test
    public void getKittensTest() {
       Mockito.when(felineMock.getKittens()).thenReturn(1);
       assertEquals("Should return 1", 1, lionMale.getKittens());
    }

    @Test
    public void doesHaveManeMaleTest() {
        assertTrue("Should return true",  lionMale.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lionFemale = new Lion(felineMock, "Female");
        assertFalse("Should return true",  lionFemale.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Should return list of meat", List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
    }

    @Test(expected = Exception.class)
    public void shouldThrowsExceptionWhenIncorrectSex() throws Exception {
        Lion lion = new Lion(felineMock, "транс-лев");
    }
}