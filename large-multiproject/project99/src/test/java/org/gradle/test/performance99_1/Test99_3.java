package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_3 {
    private final Production99_3 production = new Production99_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}