package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_187 {
    private final Production72_187 production = new Production72_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}