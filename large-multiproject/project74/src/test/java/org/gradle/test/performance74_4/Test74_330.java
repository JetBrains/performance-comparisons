package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_330 {
    private final Production74_330 production = new Production74_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}