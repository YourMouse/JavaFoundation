package org.cases.oop;

public class Task02Tesk {
public static void main(String[] args) {
	SendTask s = new SendTask(76.34,"HYX600235");
    s.SendBefore();
    Transportation t = new ZTransportation("С��","Z025","��");
    GPS g = new Phone("193,485");
    s.Send(t,g);
    s.SendAfter(t);
    
}
}
