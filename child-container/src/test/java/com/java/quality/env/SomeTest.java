package com.java.quality.env;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeTest {

    private Some some;

    @Before
    public void setUp() throws Exception {
        some = new Some();
    }

    @Test
    public void sum() {
        int res = some.sum(100, 120);
        assertEquals(220, res);
    }

    @Test
    public void rest() {
        int res = some.resta(100, 120);
        assertEquals(-20, res);
    }

    @Test
    public void mult() {
        int res = some.mult(100,50);
        assertEquals(5000,res);
    }

    @Test
    public void div() {

    }
}