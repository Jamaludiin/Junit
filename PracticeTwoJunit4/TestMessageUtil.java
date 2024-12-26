package PracticeTwoJunit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageUtil {

    String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
     System.out.println("This is testPrintMessage()");    

      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());   
      
      System.err.println("Test print message COMPLETED\n"); 
   }
    

   // second test
   String message2 = "Robert";	
   MessageUtil messageUtil2 = new MessageUtil(message2);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("This is testSalutationMessage()");

      System.out.println("Inside testSalutationMessage()");
      message2 = "Hi!" + "Robert";
      assertEquals(message2,messageUtil2.salutationMessage());
      
      System.err.println("Test salutation message COMPLETED\n"); 
   }



   String message3 = "Hello World";	
   MessageUtil messageUtil3 = new MessageUtil(message3);

   @Test
   public void testPrintMessage2() {

      System.out.println("This is testPrintMessage2()");
      
      message3 = "New Word";
      assertEquals(message3,messageUtil3.printMessage());   // fail because the message is changed

      System.err.println("Test print message2 COMPLETED\n"); 
   }
}
