package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;


    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals("Should return list of meat", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Should return \"Кошачьи\"", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParametersTest() {
        assertEquals("Should return 1", 1, feline.getKittens());
    }


    @RunWith(Parameterized.class)
    public static class FelineParameterizedTest {
        private final int kittensCount;
        private final int kittensCountExpected;

        private Feline feline;


        @Before
        public void initFeline() {
            feline = new Feline();
        }

        public FelineParameterizedTest(int kittensCount, int kittensCountExpected) {
            this.kittensCount = kittensCount;
            this.kittensCountExpected = kittensCountExpected;
        }

        //Для параметризованного запуска метода getKittens
        @Parameterized.Parameters(name = "Test data: parameter = {0}, expected result = {1}")
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {1, 1},
                    {10, 10},
                    {-1, -1},
                    {0, 0}
            };
        }

        @Test
        public void getKittensWithParameterTest() {
            assertEquals("Should return " + kittensCountExpected,
                    kittensCountExpected, feline.getKittens(kittensCount));
        }
    }
}