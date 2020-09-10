package using_thread_class;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from thread - " + Thread.currentThread().getName() + " with id = "
				+ Thread.currentThread().getId() + " and priority of " + Thread.currentThread().getPriority());
	}
}
