package com.junit5;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main main=new Main();
    public void setUp() throws Exception {

        super.setUp();
    }

    public void testDivide() {
        int actual_result = main.divide(10,5);
        int expected_result = 2;
        assertEquals(expected_result,actual_result);
    }
}