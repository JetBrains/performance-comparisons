package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_338 {
    private final Production30_338 production = new Production30_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}