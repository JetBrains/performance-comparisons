package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_364 {
    private final Production99_364 production = new Production99_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}