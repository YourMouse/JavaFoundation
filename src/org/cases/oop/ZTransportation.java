package org.cases.oop;

public class ZTransportation extends Transportation{

	public ZTransportation() {
		super();
	}

	public ZTransportation(String name, String jsbh, String mx) {
		super(name, jsbh, mx);
	}
    public void transport()
    {
    	System.out.println("运输进行中。。。");
    }
}
