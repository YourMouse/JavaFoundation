package org.cases.oop;

@SuppressWarnings("unused")
public class SendTask implements Careable{
	//定义货物重量及快递单号
	private double hz;
	private String kddh;
	private String name;
	public SendTask() {
		
	}
    public SendTask(double hz,String kddh) {
		this.hz = hz;
		this.kddh = kddh;
	}
    public void upkeep()
    {
    	System.out.println("货物运输车辆保养完毕！");	
    }
	
    
    //货物运送前
	public void SendBefore()
	{
		System.out.println("订单开始处理，仓库验货中。。。");
		System.out.println("货物重量：" + hz + "kg");
		System.out.println("货物检验完毕！");
		System.out.println("货物填装完毕！");
		System.out.println("运货人已通知！");
		System.out.println();
		System.out.println("=========================");
		System.out.println();
	}
	
	//货物运送中
	public void Send(Transportation t,GPS g)
	{
		System.out.println("运货人" + t.getName() + "正在驾驶编号为" + t.getJsbh() + "的" + t.getMx() + "发送货物！");
		t.transport();
		g.xszb();
		System.out.println();
		System.out.println("=========================");
		System.out.println();
	}
	
	//货物运送后
	public void SendAfter(Transportation t)
	{
		System.out.println("货物运输已完成！");
		System.out.println("运货人" + t.getName() + "所驾驶驾驶编号为" + t.getJsbh() + "的" + t.getMx() + "已归还！");
		upkeep();
	}
	
	public double getHz() {
		return hz;
	}
	public void setHz(double hz) {
		this.hz = hz;
	}
	public String getKddh() {
		return kddh;
	}
	public void setKddh(String kddh) {
		this.kddh = kddh;
	}
	
}
