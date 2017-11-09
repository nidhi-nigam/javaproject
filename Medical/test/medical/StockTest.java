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
public class StockTest {
    
    public StockTest() {
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
     * Test of getConnection method, of class Stock.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Stock instance = new Stock();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersList method, of class Stock.
     */
    @Test
    public void testGetUsersList() {
        System.out.println("getUsersList");
        Stock instance = new Stock();
        ArrayList<UserB> expResult = null;
        ArrayList<UserB> result = instance.getUsersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Show_Users_In_JTable method, of class Stock.
     */
    @Test
    public void testShow_Users_In_JTable() {
        System.out.println("Show_Users_In_JTable");
        Stock instance = new Stock();
        instance.Show_Users_In_JTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSqlquery method, of class Stock.
     */
    @Test
    public void testExecuteSqlquery() {
        System.out.println("executeSqlquery");
        String query = "";
        String message = "";
        Stock instance = new Stock();
        instance.executeSqlquery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Stock.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Stock instance = new Stock();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Stock.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Stock.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
