package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_251 {
    private final Production14_251 production = new Production14_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}