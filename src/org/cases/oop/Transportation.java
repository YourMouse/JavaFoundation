package org.cases.oop;

public abstract class Transportation {
	private String name;
	private String jsbh;
	private String mx;
	public Transportation() {
		
	}
	public Transportation(String name, String jsbh, String mx) {
		this.name = name;
		this.jsbh = jsbh;
		this.mx = mx;
	}
	//‘À ‰∑Ω∑®
	public abstract void transport();
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJsbh() {
		return jsbh;
	}
	public void setJsbh(String jsbh) {
		this.jsbh = jsbh;
	}
	public String getMx() {
		return mx;
	}
	public void setMx(String mx) {
		this.mx = mx;
	}
	
}
