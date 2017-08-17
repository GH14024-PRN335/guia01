/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC12
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of main method, of class Utilities.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Utilities.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResume method, of class Utilities.
     */
    @Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "";
        String expResult = "";
        String result = Utilities.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalizar method, of class Utilities.
     */
    @Test
    public void testCapitalizar() {
        System.out.println("capitalizar");
        String texto = "";
        String expResult = "";
        String result = Utilities.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarCoincidencias method, of class Utilities.
     */
    @Test
    public void testContarCoincidencias() {
        System.out.println("contarCoincidencias");
        String frase = "";
        String texto = "";
        int expResult = 0;
        int result = Utilities.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
