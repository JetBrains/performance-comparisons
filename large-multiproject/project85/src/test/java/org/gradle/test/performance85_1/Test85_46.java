package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_46 {
    private final Production85_46 production = new Production85_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}