package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_404 {
    private final Production79_404 production = new Production79_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}