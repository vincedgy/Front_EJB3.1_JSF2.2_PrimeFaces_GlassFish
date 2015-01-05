/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb;

import java.util.Collection;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.vincedgy.ejb.entity.ActorEntity;

/**
 *
 * @author Vincent
 */
@Stateless
public class ActorServiceEJB implements ActorServiceEJBLocal {

    @PersistenceContext(name = "sakilaPU")
    EntityManager em;
    
    @Override
    public Collection<ActorEntity> findAll() {        
        Collection <ActorEntity> actors = em.createNamedQuery("Actor.findAll").getResultList();
        return actors;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
