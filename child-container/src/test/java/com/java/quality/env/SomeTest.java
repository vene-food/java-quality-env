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
}