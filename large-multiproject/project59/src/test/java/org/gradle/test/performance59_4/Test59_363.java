package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_363 {
    private final Production59_363 production = new Production59_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}