package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_317 {
    private final Production65_317 production = new Production65_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}