package com.test.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class FirstEjb
 */
@Stateless
public class FirstEjb implements FirstEjbRemote, FirstEjbLocal {

    /**
     * Default constructor. 
     */
    public FirstEjb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayLocal(String s) {
		// TODO Auto-generated method stub
		return s+"...local...........testabc";
	}

	@Override
	public String sayRemote(String s) {
		// TODO Auto-generated method stub
		return s+"...remote...........abc";
	}

}
