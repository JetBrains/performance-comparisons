package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_440 {
    private final Production78_440 production = new Production78_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}