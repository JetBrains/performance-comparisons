package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_69 {
    private final Production78_69 production = new Production78_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}