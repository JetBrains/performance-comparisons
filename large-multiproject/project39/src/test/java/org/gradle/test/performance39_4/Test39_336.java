package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_336 {
    private final Production39_336 production = new Production39_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}