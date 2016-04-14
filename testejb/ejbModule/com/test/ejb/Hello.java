package com.test.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Hello implements HelloRemote {

    /**
     * Default constructor. 
     */
    public Hello() {
    	System.out.println("sdfsdds...................");
        // TODO Auto-generated constructor stub
    }

    
    @Override  
    public String sayHello(String name) {  
          
        return name+"ª∂”≠ π”√EJB3.0~~";  
          
    }  
}
