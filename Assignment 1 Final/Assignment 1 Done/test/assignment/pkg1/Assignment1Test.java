/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import static assignment.pkg1.Assignment1.stringPower;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0719943
 */
public class Assignment1Test {
    
    public Assignment1Test() {
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
     * Test of main method, of class Assignment1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPower method, of class Assignment1.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String s = "";
        int a = 0;
        String expResult = "";
        String result = Assignment1.stringPower(s, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testEmptyStringShouldReturnEmptyString() {
       System.out.println("stringPower");
       String s = "";
       int a = 1;
       String expResult = "";
       String result = Assignment1.stringPower(s, a);
       assertEquals(expResult, result);
       fail("The test case is a prototype.");
    }
    
    public void testLessThanOneShouldReturnNull(){
       System.out.println("stringPower");
       String s = "";
       int a = -1;
       String expResult = "";
       String result = Assignment1.stringPower(s, a);
       assertEquals(expResult, result);
       fail("The test case is a prototype.");
    }
    
    public void testStringAndOneShouldReturnString(){
       System.out.println("stringPower");
       String s = "Hello";
       int a = 1;
       String expResult = "Hello";
       String result = Assignment1.stringPower(s, a);
       assertEquals(expResult, result);
       fail("The test case is a prototype.");
    }
    
    public void testStringAndTwoShouldReturnStringDoubled(){
       System.out.println("stringPower");
       String s = "bob";
       int a = 2;
       String expResult = "bobbob";
       String result = Assignment1.stringPower(s, a);
       assertEquals(expResult, result);
       fail("The test case is a prototype.");
    }
}
