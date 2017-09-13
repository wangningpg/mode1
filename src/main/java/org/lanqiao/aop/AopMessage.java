package org.lanqiao.aop;

public class AopMessage {
	public void before(){
		System.out.println("后置通知");
	}
	public void after(){
		System.out.println("前置通知");
	}
}
