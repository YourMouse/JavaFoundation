package org.cases.oop;

public class Phone implements GPS{
	private String zb;
	
	public Phone() {
		super();
	}
	public Phone(String zb) {
		this.zb = zb;
	}
	
	
	public String getZb() {
		return zb;
	}

	public void setZb(String zb) {
		this.zb = zb;
	}
	public void xszb()
	{
		System.out.println("货物当前坐标为：" + getZb());
	}
}
