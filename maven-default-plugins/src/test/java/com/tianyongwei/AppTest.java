package com.tianyongwei;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void add() {
        assertEquals(6, new App().add(1,2,3));
    }
}