package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_41 {
    private final Production73_41 production = new Production73_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}