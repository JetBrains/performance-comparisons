package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_157 {
    private final Production73_157 production = new Production73_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}