/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nidhi
 */
public class UserBTest {
    
    public UserBTest() {
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
     * Test of getName method, of class UserB.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserB instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class UserB.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        UserB instance = null;
        String expResult = "";
        String result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBatchno method, of class UserB.
     */
    @Test
    public void testGetBatchno() {
        System.out.println("getBatchno");
        UserB instance = null;
        String expResult = "";
        String result = instance.getBatchno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpirydate method, of class UserB.
     */
    @Test
    public void testGetExpirydate() {
        System.out.println("getExpirydate");
        UserB instance = null;
        int expResult = 0;
        int result = instance.getExpirydate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRate method, of class UserB.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        UserB instance = null;
        float expResult = 0.0F;
        float result = instance.getRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailability method, of class UserB.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        UserB instance = null;
        int expResult = 0;
        int result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
