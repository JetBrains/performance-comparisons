package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_401 {
    private final Production91_401 production = new Production91_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}