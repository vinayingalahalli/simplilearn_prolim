package using_runnable_interface;

public class RunMain {

	public static void main(String[] args) {
		
		
		RunnableThread r1=new RunnableThread();
		Thread t1=new Thread(r1,"run-1");
		
		RunnableThread r2=new RunnableThread();
		Thread t2=new Thread(r2,"run-2");
		
		RunnableThread r3=new RunnableThread();
		Thread t3=new Thread(r3,"run-3");
		
		RunnableThread r4=new RunnableThread();
		Thread t4=new Thread(r4,"run-4");
		
//		t1.setDaemon(true);
//		t2.setDaemon(true);
//		t3.setDaemon(true);
//		t4.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Main ends here");
		
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from Thread -> "+Thread.currentThread().getName()+" value of i = "+i);
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//		}
	}

}
