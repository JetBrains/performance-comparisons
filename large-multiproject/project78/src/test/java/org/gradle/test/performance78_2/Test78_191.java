package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_191 {
    private final Production78_191 production = new Production78_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}