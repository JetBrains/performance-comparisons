package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_1 {
    private final Production51_1 production = new Production51_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}