package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_282 {
    private final Production25_282 production = new Production25_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}