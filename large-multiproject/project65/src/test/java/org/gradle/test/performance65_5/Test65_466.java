package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_466 {
    private final Production65_466 production = new Production65_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}