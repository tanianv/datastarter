package com.nevmtet.jva030;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList arrayWithThreeElements = new ArrayList();

    @Before
    public void before() {
        arrayWithThreeElements.add("A");
        arrayWithThreeElements.add("B");
        arrayWithThreeElements.add("C");
    }

    @Test
    public void testGetByIndex() {
        assertEquals(3, arrayWithThreeElements.size());

        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("B", arrayWithThreeElements.get(1));
        assertEquals("C", arrayWithThreeElements.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(3, arrayWithThreeElements.size());
    }
    @Test
    public void testAddNewObject(){
        arrayWithThreeElements.add("D", 3);
        assertEquals(4, arrayWithThreeElements.size());
        assertEquals("D", arrayWithThreeElements.get(3));

    }
    @Test
    public void testRemoveObject(){
        arrayWithThreeElements.remove(0);
        assertEquals(2, arrayWithThreeElements.size());
        assertEquals("B", arrayWithThreeElements.get(0));
    }



}