package com.bfxy.disruptor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Review {

	
	public static void main(String[] args) throws Exception {
		
		//ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		
		//CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
		
		//cowal.add("aaaa");
		
//		AtomicLong count = new AtomicLong(1);
//		boolean flag = count.compareAndSet(0, 2);
//		System.err.println(flag);
//		System.err.println(count.get());
		
		
		/**
		 * 
		 *  LockSupport : 
		Thread A = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i =0; i < 10; i ++){
					sum += i;
				}
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LockSupport.park();	//后执行
				System.err.println("sum: " + sum);
			}
		});
		
		A.start();
		
		Thread.sleep(1000);
		
		LockSupport.unpark(A);	//先执行
		*/
		
		/**
		Executors.newCachedThreadPool();
		Executors.newFixedThreadPool(10);
		
		
		ThreadPoolExecutor pool = new ThreadPoolExecutor(5,
				Runtime.getRuntime().availableProcessors() * 2,
				60,
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(200),
				new ThreadFactory() {
					@Override
					public Thread newThread(Runnable r) {
						Thread t = new Thread(r);
						t.setName("order-thread");
						if(t.isDaemon()) {
							t.setDaemon(false);
						}
						if(Thread.NORM_PRIORITY != t.getPriority()) {
							t.setPriority(Thread.NORM_PRIORITY);
						}
						return t;
					}
				},
				new RejectedExecutionHandler() {
					@Override
					public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
						System.err.println("拒绝策略:" + r);
					}
				});
		
		*/
		
		ReentrantLock reentrantLock = new ReentrantLock(true);

	
		
		
		
		
		
		
		
		
		
		
	}
}
