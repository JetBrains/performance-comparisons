package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_310 {
    private final Production91_310 production = new Production91_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}