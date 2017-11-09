/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.Connection;
import java.util.ArrayList;
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
public class AvailabilityTest {
    
    public AvailabilityTest() {
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
     * Test of getConnection method, of class Availability.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Availability instance = new Availability();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersList method, of class Availability.
     */
    @Test
    public void testGetUsersList() {
        System.out.println("getUsersList");
        String query1 = "";
        Availability instance = new Availability();
        ArrayList<UserB> expResult = null;
        ArrayList<UserB> result = instance.getUsersList(query1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Show_Users_In_JTable method, of class Availability.
     */
    @Test
    public void testShow_Users_In_JTable() {
        System.out.println("Show_Users_In_JTable");
        String query1 = "";
        Availability instance = new Availability();
        instance.Show_Users_In_JTable(query1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSqlquery method, of class Availability.
     */
    @Test
    public void testExecuteSqlquery() {
        System.out.println("executeSqlquery");
        String query = "";
        String message = "";
        Availability instance = new Availability();
        instance.executeSqlquery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Availability.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Availability instance = new Availability();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Availability.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Availability.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
