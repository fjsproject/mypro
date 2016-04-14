package com.test.ejb;

import javax.ejb.Remote;

@Remote
public interface FirstEjbRemote {
	public String sayRemote(String s);

}
