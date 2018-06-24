package demo.threading06.countdowntask;

import in.conceptarchitect.threading.ThreadUtils;

public class Program {


	public static void main(String[] args) {
		
		// TODO:  Create thread to invoke below countDown methods 
		
		Thread t1=null;	//should count down from 200
		Thread t2=null; //should count down from 100
		
		t1.start();
		t2.start();
		System.out.println("end of main program");
	
	
	}

	
	public static  void countDown(int max) {
		
		Thread me=Thread.currentThread();
		//System.out.println("Thread #"+me.getId()+" starts...");
		ThreadUtils.print("starts");

		while(max>=0){
			
			ThreadUtils.print("counts %d", max);
			max--;
			
		}
		
		ThreadUtils.print("finishes...");

	}

}
