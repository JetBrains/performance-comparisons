package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_342 {
    private final Production68_342 production = new Production68_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}