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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author nidhi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({medical.SearchBillTest.class, medical.CreateNewBillTest.class, medical.SearchedBillTest.class, medical.UserCTest.class, medical.MedicalTest.class, medical.LoginTest.class, medical.AvailabilityTest.class, medical.CreateDeleteUserTest.class, medical.UserBTest.class, medical.AdminTest.class, medical.UserTest.class, medical.StockTest.class})
public class MedicalSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
