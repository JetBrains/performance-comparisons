package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_105 {
    private final Production68_105 production = new Production68_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}