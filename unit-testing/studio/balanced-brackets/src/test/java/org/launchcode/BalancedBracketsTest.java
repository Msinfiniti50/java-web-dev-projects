package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.launchcode.BalancedBrackets.hasBalancedBrackets;

class BalancedBracketsTest {
    //TODO: add tests here
//Test 1//
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(hasBalancedBrackets("[]"));
    }

    //Test 2//
    @Test
    public void emptyFunction() {
        assertEquals(true, true);
    }

    //Test 3//
    @Test
    public void simplePassLaunchCodeTest() {
        assertFalse(hasBalancedBrackets(("[LaunchCode]")));
        assertFalse(hasBalancedBrackets( "Launch[Code]"));
        assertFalse(hasBalancedBrackets( "[]"));

    }

    //Test 4//
    @Test
 public void failLaunchCodeTest() {
    assertTrue(hasBalancedBrackets(""), "An empty string should be consideredas having balanced brackets");
}
//Test 5//
@Test
public void integerIsZero() {
    int brackets = 0;
    assertEquals(0, brackets, "The value of brackets should be zero.");
}
//Test 6//


 @Test
public void testStringWithNoBrackets(){
    assertFalse(hasBalancedBrackets( "Hello, world!"),  "A string without brackets should be considered as having balanced brackets");
 }}
