package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_314 {
    private final Production79_314 production = new Production79_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}