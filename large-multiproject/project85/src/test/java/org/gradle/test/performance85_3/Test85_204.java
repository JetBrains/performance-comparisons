package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_204 {
    private final Production85_204 production = new Production85_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}