package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_229 {
    private final Production39_229 production = new Production39_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}