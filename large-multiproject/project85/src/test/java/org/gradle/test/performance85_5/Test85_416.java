package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_416 {
    private final Production85_416 production = new Production85_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}