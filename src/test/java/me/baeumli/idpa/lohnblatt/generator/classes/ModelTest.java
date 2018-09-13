/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Baeumli
 */
public class ModelTest {
    
    public ModelTest() {
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
     * Test of setUVG method, of class Model.
     */
    @Test
    public void testSetUVG() {
        System.out.println("setUVG");
        double UVG = 0.0;
        Model instance = new Model();
        instance.setUVG(UVG);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNBU method, of class Model.
     */
    @Test
    public void testSetNBU() {
        System.out.println("setNBU");
        double NBU = 0.0;
        Model instance = new Model();
        instance.setNBU(NBU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBU method, of class Model.
     */
    @Test
    public void testSetBU() {
        System.out.println("setBU");
        double BU = 0.0;
        Model instance = new Model();
        instance.setBU(BU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUVG method, of class Model.
     */
    @Test
    public void testGetUVG() {
        System.out.println("getUVG");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getUVG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNBU method, of class Model.
     */
    @Test
    public void testGetNBU() {
        System.out.println("getNBU");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getNBU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBU method, of class Model.
     */
    @Test
    public void testGetBU() {
        System.out.println("getBU");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getBU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getALV method, of class Model.
     */
    @Test
    public void testGetALV() {
        System.out.println("getALV");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getALV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAHV_IV_EO method, of class Model.
     */
    @Test
    public void testGetAHV_IV_EO() {
        System.out.println("getAHV_IV_EO");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getAHV_IV_EO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBVG method, of class Model.
     */
    @Test
    public void testGetBVG() {
        System.out.println("getBVG");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getBVG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKoordinationsabzug method, of class Model.
     */
    @Test
    public void testGetKoordinationsabzug() {
        System.out.println("getKoordinationsabzug");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getKoordinationsabzug();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Model.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Model.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Model instance = new Model();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Model.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Model.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Model instance = new Model();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthday method, of class Model.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getBirthday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthday method, of class Model.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        LocalDate birthday = null;
        Model instance = new Model();
        instance.setBirthday(birthday);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAhvNumber method, of class Model.
     */
    @Test
    public void testGetAhvNumber() {
        System.out.println("getAhvNumber");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getAhvNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAhvNumber method, of class Model.
     */
    @Test
    public void testSetAhvNumber() {
        System.out.println("setAhvNumber");
        String ahvNumber = "";
        Model instance = new Model();
        instance.setAhvNumber(ahvNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnder16 method, of class Model.
     */
    @Test
    public void testGetUnder16() {
        System.out.println("getUnder16");
        Model instance = new Model();
        int expResult = 0;
        int result = instance.getUnder16();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnder16 method, of class Model.
     */
    @Test
    public void testSetUnder16() {
        System.out.println("setUnder16");
        int under16 = 0;
        Model instance = new Model();
        instance.setUnder16(under16);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOver16 method, of class Model.
     */
    @Test
    public void testGetOver16() {
        System.out.println("getOver16");
        Model instance = new Model();
        int expResult = 0;
        int result = instance.getOver16();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOver16 method, of class Model.
     */
    @Test
    public void testSetOver16() {
        System.out.println("setOver16");
        int over16 = 0;
        Model instance = new Model();
        instance.setOver16(over16);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonatslohn method, of class Model.
     */
    @Test
    public void testGetMonatslohn() {
        System.out.println("getMonatslohn");
        Model instance = new Model();
        BigDecimal expResult = null;
        BigDecimal result = instance.getMonatslohn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonatslohn method, of class Model.
     */
    @Test
    public void testSetMonatslohn() {
        System.out.println("setMonatslohn");
        double monatslohn = 0.0;
        Model instance = new Model();
        instance.setMonatslohn(monatslohn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
