package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_372 {
    private final Production19_372 production = new Production19_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}