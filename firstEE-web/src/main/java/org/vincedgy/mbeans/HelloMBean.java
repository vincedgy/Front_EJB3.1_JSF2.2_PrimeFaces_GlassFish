/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.mbeans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.vincedgy.ejb.SayHelloEJB;

/**
 *
 * @author Vincent
 */
@Named(value = "helloMBean")
@SessionScoped
public class HelloMBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @EJB
    SayHelloEJB sayHelloEJB;
    
    /**
     * Creates a new instance of HelloMBean
     */
    public HelloMBean() {
    }
    
    public String sayHello() {
        return sayHelloEJB.sayHello();
    }
    
}
