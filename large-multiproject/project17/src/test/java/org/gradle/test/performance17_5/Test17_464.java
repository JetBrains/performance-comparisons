package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_464 {
    private final Production17_464 production = new Production17_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}