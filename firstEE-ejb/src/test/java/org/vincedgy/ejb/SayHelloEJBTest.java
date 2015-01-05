/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Vincent
 */
public class SayHelloEJBTest {

    private static EJBContainer container;

    public SayHelloEJBTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        System.out.println("Opening the container");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        container.close();
        System.out.println("Closing the container");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of businessMethod method, of class SayHelloEJB.
     */
    @Test
    public void testBusinessMethod() throws Exception {
        System.out.println("businessMethod");
        SayHello instance = (SayHello) container.getContext().lookup("java:global/classes/SayHelloEJB");
        assertTrue(instance.sayHello().equals("Hello world !"));
    }

    /**
     * Test of sayHello method, of class SayHelloEJB.
     */
    @Test
    @Ignore
    public void testSayHello() throws Exception {
        SayHelloEJB instance = (SayHelloEJB) container.getContext().lookup("java:global/classes/SayHelloEJB");
        String expResult = "";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
