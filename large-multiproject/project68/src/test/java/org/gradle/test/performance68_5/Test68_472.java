package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_472 {
    private final Production68_472 production = new Production68_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}