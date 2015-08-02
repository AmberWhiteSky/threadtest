package com.amberwhitesky.threaddemo;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"runing.....");
	}
}
