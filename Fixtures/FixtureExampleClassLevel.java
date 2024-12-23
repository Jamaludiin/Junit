package Fixtures;

import org.junit.AfterClass;
import org.junit.BeforeClass;



public class FixtureExampleClassLevel {

    private static String sharedResource;
    
     @BeforeClass
    public static void setUpClass() {
        // Set up shared resource
        sharedResource = "Shared Resource Initialized";
        System.out.println("Setup class-level resources: " + sharedResource);


        /*
         What to Set Up and Tear Down at the Class Level
            Setup in setUpClass()
                Database Connections: If your tests involve interacting with a database, 
                you can establish the connection here.
                
                Mock Server: Set up a mock server to simulate API responses.
                
                Large Data Sets: Load data that will be shared across multiple tests.
               
                Static Resources: Initialize shared objects or static fields that all test methods use.
                
                Configuration: Set global configurations for the tests (e.g., logging, environment variables).
         */
    }

    @AfterClass
    public static void tearDownClass() {
        // Release shared resource
        sharedResource = null;
        System.out.println("Teardown class-level resources");

        /*
         What to Set Up and Tear Down at the Class Level
            Teardown in tearDownClass()
                Database Connections: If your tests involve interacting with a database, 
                you can close the connection here.
                
                Mock Server: Clean up the mock server resources.
                
                Large Data Sets: Unload data that was loaded in setUpClass().
                
                Static Resources: Clean up shared objects or static fields.
                
                Configuration: Reset global configurations to their default values.

                Database Cleanup: Close database connections or rollback any transactions made during the tests.
                Stop Mock Servers: Shut down any mock servers started in setUpClass().
                Release Static Resources: Free memory allocated for shared objects or static fields.
                Reset Configurations: Clear or reset any global configurations.
         */
    }

}



