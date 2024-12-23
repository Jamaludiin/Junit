package Fixtures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FixtureExample {

    private ArrayList<String> list;

    // This method runs before every test
    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println("Setup complete: " + list);
    }

    // This method runs after every test
    @After
    public void tearDown() {
        list.clear();
        System.out.println("Teardown complete: " + list);
    }

    // Test case 1
    @Test
    public void testAddElement() {
        list.add("cherry");
        assertEquals(3, list.size());
        System.out.println("Test 1 passed");
    }

    // Test case 2
    @Test
    public void testRemoveElement() {
        list.remove("banana");
        assertEquals(1, list.size());
        System.out.println("Test 2 passed");
    }
}


/*
 * 
Explanation of the Example
    setUp() Method:

    This is annotated with @Before.
    It initializes the list with two items: "apple" and "banana".
    This method ensures that every test starts with a list in the same state.
    tearDown() Method:

    This is annotated with @After.
    It clears the list after every test to ensure no leftover data from a previous test affects the next one.
    Test Cases:

    Test 1: Adds an item ("cherry") to the list and verifies the size is now 3.
    Test 2: Removes an item ("banana") and verifies the size is now 1.

Output:

For every test, you'll see logs indicating setup and teardown:

    Setup complete: [apple, banana]
    Test 1 passed
    Teardown complete: []
    Setup complete: [apple, banana]
    Test 2 passed
    Teardown complete: []
 */