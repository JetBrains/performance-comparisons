package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_412 {
    private final Production78_412 production = new Production78_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}