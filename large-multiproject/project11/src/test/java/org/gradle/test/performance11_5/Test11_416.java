package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_416 {
    private final Production11_416 production = new Production11_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}