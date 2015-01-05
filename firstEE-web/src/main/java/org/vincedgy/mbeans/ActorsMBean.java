/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.mbeans;

import java.io.Serializable;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.vincedgy.ejb.ActorServiceEJBLocal;
import org.vincedgy.ejb.entity.ActorEntity;

/**
 *
 * @author Vincent
 */
@Named(value = "actors")
@SessionScoped
public class ActorsMBean implements Serializable {
    
    private final static Logger logger = Logger.getLogger(ActorsMBean.class.getName()); 
    
    private static final long serialVersionUID = 1L;

    public ActorsMBean() {}
    
    @EJB
    private ActorServiceEJBLocal actorServiceEJB;
    
    Collection<ActorEntity> actors;

    public Collection<ActorEntity> getActors() {
        return actors;
    }

    @PostConstruct
    public void init() {
        try {
            logger.log(Level.INFO, "Initialize ActorsMBean");
            actors = actorServiceEJB.findAll();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getLocalizedMessage());
        }
    }
    
    
    
}
