package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_416 {
    private final Production87_416 production = new Production87_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}