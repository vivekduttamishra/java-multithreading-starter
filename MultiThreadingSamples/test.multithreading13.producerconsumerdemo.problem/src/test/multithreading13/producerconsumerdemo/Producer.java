package test.multithreading13.producerconsumerdemo;

import in.conceptarchitect.threading.ThreadUtils;

public class Producer implements Runnable {

	Thread thread;
	volatile boolean canRun;
	private Stock stock;
	
	public Producer(Stock stock, int priority) {
		// 
		this.stock=stock;
		thread=new Thread(this);
		thread.setPriority(priority);
		
	}

	@Override
	public void run() {
		
		canRun=true;
		while(canRun){
			stock.produce();
		}
	}

	public void start(){thread.start();}
	public void stop(){canRun=false;}
	public void waitFor(){ThreadUtils.waitFor(thread);}
	
}
