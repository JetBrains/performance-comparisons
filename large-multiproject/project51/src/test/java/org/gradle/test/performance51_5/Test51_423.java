package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_423 {
    private final Production51_423 production = new Production51_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}