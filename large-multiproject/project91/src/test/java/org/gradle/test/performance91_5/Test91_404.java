package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_404 {
    private final Production91_404 production = new Production91_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}