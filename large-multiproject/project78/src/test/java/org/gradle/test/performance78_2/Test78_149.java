package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_149 {
    private final Production78_149 production = new Production78_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}