package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_282 {
    private final Production44_282 production = new Production44_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}