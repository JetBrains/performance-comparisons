package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_99 {
    private final Production19_99 production = new Production19_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}