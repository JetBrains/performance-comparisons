package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_485 {
    private final Production51_485 production = new Production51_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}