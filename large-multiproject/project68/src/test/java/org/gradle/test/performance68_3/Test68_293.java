package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_293 {
    private final Production68_293 production = new Production68_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}