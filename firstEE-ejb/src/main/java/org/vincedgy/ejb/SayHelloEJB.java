/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.ejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class SayHelloEJB implements SayHello {
  
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public String sayHello() {
        return "Hello world !";
    }
    
    
}
