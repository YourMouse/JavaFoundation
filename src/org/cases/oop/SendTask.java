package org.cases.oop;

@SuppressWarnings("unused")
public class SendTask implements Careable{
	//���������������ݵ���
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
    	System.out.println("�������䳵��������ϣ�");	
    }
	
    
    //��������ǰ
	public void SendBefore()
	{
		System.out.println("������ʼ�����ֿ�����С�����");
		System.out.println("����������" + hz + "kg");
		System.out.println("���������ϣ�");
		System.out.println("������װ��ϣ�");
		System.out.println("�˻�����֪ͨ��");
		System.out.println();
		System.out.println("=========================");
		System.out.println();
	}
	
	//����������
	public void Send(Transportation t,GPS g)
	{
		System.out.println("�˻���" + t.getName() + "���ڼ�ʻ���Ϊ" + t.getJsbh() + "��" + t.getMx() + "���ͻ��");
		t.transport();
		g.xszb();
		System.out.println();
		System.out.println("=========================");
		System.out.println();
	}
	
	//�������ͺ�
	public void SendAfter(Transportation t)
	{
		System.out.println("������������ɣ�");
		System.out.println("�˻���" + t.getName() + "����ʻ��ʻ���Ϊ" + t.getJsbh() + "��" + t.getMx() + "�ѹ黹��");
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
