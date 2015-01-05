/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb;

import java.util.Collection;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.vincedgy.ejb.entity.ActorEntity;

/**
 *
 * @author Vincent
 */
public class ActorServiceEJBTest {
    
    public ActorServiceEJBTest() {
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
     * Test of findAll method, of class ActorServiceEJB.
     */
    @Test
    @Ignore
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ActorServiceEJBLocal instance = (ActorServiceEJBLocal)container.getContext().lookup("java:global/classes/ActorServiceEJB");
        Collection<ActorEntity> expResult = null;
        Collection<ActorEntity> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
