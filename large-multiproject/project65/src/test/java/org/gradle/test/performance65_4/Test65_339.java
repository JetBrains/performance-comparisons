package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_339 {
    private final Production65_339 production = new Production65_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}