package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_475 {
    private final Production23_475 production = new Production23_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}