/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ishvar
 */
public class CustomerTest {
    Customer cust;
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cust = new Customer();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testFirst() {
         cust.setFirst("Tom");
         assertEquals("Tom",cust.getFirst());
     }
     @Test
     public void testLast() {
         cust.setLast("Smith");
         assertEquals("Smith",cust.getLast());
     }
      @Test
     public void testEmail() {
         cust.setEmail("tom@abc.com");
         assertEquals("tom@abc.com",cust.getEmail());
     }
      @Test
     public void testNumber() {
         cust.setNumber("123-123-4567");
         assertEquals("123-123-4567",cust.getNumber());
     }
     
}
