package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_6 {
    private final Production19_6 production = new Production19_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}