package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_199 {
    private final Production15_199 production = new Production15_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}