/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gc885074
 */
public class FruitSimpleTest {
    
    public FruitSimpleTest() {
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
     * Test of isSeedless method, of class FruitSimple.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        FruitSimple instance = null;
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FruitSimple.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FruitSimple instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class FruitSimple.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        FruitSimple instance = null;
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class FruitSimple.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        FruitSimple instance = null;
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FruitSimple.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FruitSimple instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FruitSimpleImpl extends FruitSimple {

        public FruitSimpleImpl() {
            super(0.0, "");
        }

        public boolean isSeedless() {
            return false;
        }

        public String toString() {
            return "";
        }
    }
    
}
