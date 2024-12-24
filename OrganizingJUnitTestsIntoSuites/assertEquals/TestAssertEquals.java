package OrganizingJUnitTestsIntoSuites.assertEquals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAssertEquals {
    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
        // assertEquals(firstArgument, secondArgument); 
        // firstArgument: is the expected value
        // secondArgument: is the actual value
        // This is a method call that expects the first argument to be equal to the second argument
       
       
        // you can use pass by value or pass by reference
        // pass by value: the value of the first argument is compared to the value of the second argument
        // pass by reference: the reference of the first argument is compared to the reference of the second argument


         }

    @Test
    public void testPassByValue() {
         // example of pass by value
         int a = 5;
         int b = 5;
         assertEquals(a, b);
    }

    @Test
    public void testPassByReference() {
         // example of pass by reference
         int[] arr1 = {1, 2, 3};
         int[] arr2 = {1, 2, 3};
         assertEquals(arr1, arr2);// this comparison fails because the reference of arr1 is not the same as the reference of arr2
    
         /*
          arr1 and arr2 are two distinct array objects in memory.
          Even though their content is identical ({1, 2, 3}), 
          they are not equal because they have different references (memory addresses).
          
          assertEquals(arr1, arr2):

          By default, assertEquals() for arrays in Java checks for reference equality (similar to arr1 == arr2), not the content of the arrays.
          Since arr1 and arr2 are different objects, their references are not equal, and the assertion fails.
          */
        }
}


