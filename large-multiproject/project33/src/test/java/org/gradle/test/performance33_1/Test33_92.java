package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_92 {
    private final Production33_92 production = new Production33_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}