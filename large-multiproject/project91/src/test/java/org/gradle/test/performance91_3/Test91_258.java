package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_258 {
    private final Production91_258 production = new Production91_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}