package using_runnable_interface;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from Thread -> "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
