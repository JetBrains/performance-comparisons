package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_293 {
    private final Production23_293 production = new Production23_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}