package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_274 {
    private final Production65_274 production = new Production65_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}