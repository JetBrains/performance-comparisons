package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_392 {
    private final Production65_392 production = new Production65_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}