package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_288 {
    private final Production49_288 production = new Production49_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}