/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb;

import java.util.Collection;
import javax.ejb.Local;
import org.vincedgy.ejb.entity.ActorEntity;

/**
 *
 * @author Vincent
 */
@Local
public interface ActorServiceEJBLocal {
    
    public Collection<ActorEntity> findAll ();
}
