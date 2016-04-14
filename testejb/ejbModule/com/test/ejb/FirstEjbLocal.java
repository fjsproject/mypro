package com.test.ejb;

import javax.ejb.Local;

@Local
public interface FirstEjbLocal {
	public String sayLocal(String s);

}
