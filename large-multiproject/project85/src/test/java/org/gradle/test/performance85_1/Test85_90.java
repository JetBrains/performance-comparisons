package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_90 {
    private final Production85_90 production = new Production85_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}