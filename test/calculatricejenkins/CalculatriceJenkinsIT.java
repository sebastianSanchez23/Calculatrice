/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricejenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pollo
 */
public class CalculatriceJenkinsIT {
    
    public CalculatriceJenkinsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculatriceJenkins.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
        // TODO review the generated test code and remove the default call to fail.
     //fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class CalculatriceJenkins.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = CalculatriceJenkins.sum(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The failed test case is a prototype.");
    }
    
}
