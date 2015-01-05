/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb.entity;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vincent
 */
public class ActorTest {
    private static EntityManager em;
    private static EntityManagerFactory emf;
    
    public ActorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("sakilaPU_local");
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void tearDownClass() {
        em.close();
        emf.close();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        Query q = em.createNamedQuery("Actor.findAll");
        Collection<ActorEntity> actors;
        actors = q.getResultList();
        assertTrue(actors.size() >0);
    }

  
}
