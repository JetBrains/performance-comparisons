package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_430 {
    private final Production78_430 production = new Production78_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}