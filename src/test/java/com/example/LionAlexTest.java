package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    LionAlex lionAlex;
    @Mock
    Feline felineMock;

    @Before
    public void initAlex() throws Exception {
        lionAlex = new LionAlex(felineMock);
    }

    @Test
    public void getFriendsTest() {
        assertEquals("Should return list of friends", List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Should return \"Нью-Йоркский зоопарк\"",  "Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());

    }

    @Test
    public void getKittensTest() {
        assertEquals("Should return 0", 0, lionAlex.getKittens());
    }

    @Test
    public void hasManeTest(){
        assertTrue("Should always has a mane", lionAlex.doesHaveMane());
    }
}