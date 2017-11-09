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
public class CreateDeleteUserTest {
    
    public CreateDeleteUserTest() {
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
     * Test of getConnection method, of class CreateDeleteUser.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        CreateDeleteUser instance = new CreateDeleteUser();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersList method, of class CreateDeleteUser.
     */
    @Test
    public void testGetUsersList() {
        System.out.println("getUsersList");
        CreateDeleteUser instance = new CreateDeleteUser();
        ArrayList<UserC> expResult = null;
        ArrayList<UserC> result = instance.getUsersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Show_Users_In_JTable method, of class CreateDeleteUser.
     */
    @Test
    public void testShow_Users_In_JTable() {
        System.out.println("Show_Users_In_JTable");
        CreateDeleteUser instance = new CreateDeleteUser();
        instance.Show_Users_In_JTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSqlquery method, of class CreateDeleteUser.
     */
    @Test
    public void testExecuteSqlquery() {
        System.out.println("executeSqlquery");
        String query = "";
        String message = "";
        CreateDeleteUser instance = new CreateDeleteUser();
        instance.executeSqlquery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class CreateDeleteUser.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        CreateDeleteUser instance = new CreateDeleteUser();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CreateDeleteUser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CreateDeleteUser.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
