package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_230 {
    private final Production59_230 production = new Production59_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}