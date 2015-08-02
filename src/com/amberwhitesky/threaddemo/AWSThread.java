package com.amberwhitesky.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AWSThread {

	public static void main(String[] args) {

		/**
		 * 1
		 */
		// 创建一个可重用固定线程数的线程池
		// ExecutorService pool = Executors.newSingleThreadExecutor();
		// Thread t1 = new MyThread();
		// Thread t2 = new MyThread();
		// Thread t3 = new MyThread();
		// Thread t4 = new MyThread();
		// Thread t5 = new MyThread();
		//
		// //将线程放入池中进行执行
		// pool.execute(t1);
		// pool.execute(t2);
		// pool.execute(t3);
		// pool.execute(t4);
		// pool.execute(t5);
		//
		// //关闭线程池
		// pool.shutdown();

		/**
		 * 2创建一个可重用固定线程数的线程池
		 */

		// ExecutorService pool =Executors.newFixedThreadPool(2);
		// //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
		// Thread t1 = new MyThread();
		// Thread t2 = new MyThread();
		// Thread t3 = new MyThread();
		// Thread t4 = new MyThread();
		// Thread t5 = new MyThread();
		// //将线程放入池中进行执行
		// pool.execute(t1);
		// pool.execute(t2);
		// pool.execute(t3);
		// pool.execute(t4);
		// pool.execute(t5);
		// //关闭线程池
		// pool.shutdown();

		/**
		 * 3一个可重用固定线程数的线程池
		 */
		// ExecutorService pool = Executors.newCachedThreadPool();
		//
		// //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
		// Thread t1 = new MyThread();
		// Thread t2 = new MyThread();
		// Thread t3 = new MyThread();
		// Thread t4 = new MyThread();
		// Thread t5 = new MyThread();
		// //将线程放入池中进行执行
		// pool.execute(t1);
		// pool.execute(t2);
		// pool.execute(t3);
		// pool.execute(t4);
		// pool.execute(t5);
		// //关闭线程池
		// pool.shutdown();

		/**
		 * 4
		 */
		ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
		/**
		 * //每隔一段时间就触发异常
		 */
		exec.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("========");
			}
		}, 1000, 5000, TimeUnit.MILLISECONDS);

		
		/**
		 * //每隔一段时间打印系统时间，证明两者是互不影响的
		 */
		exec.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println(System.nanoTime());
			}
		}, 1000, 2000, TimeUnit.MILLISECONDS);
	}

}
