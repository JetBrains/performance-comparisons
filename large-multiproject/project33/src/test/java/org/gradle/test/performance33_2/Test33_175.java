package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_175 {
    private final Production33_175 production = new Production33_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}