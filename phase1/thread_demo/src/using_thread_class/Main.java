package using_thread_class;

public class Main {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setPriority(6);
		t.setName("myMain");
		System.out.println(Thread.currentThread());
		
		
		MyThread t1=new MyThread();
		t1.setName("t-1");
		MyThread t2=new MyThread();
		t2.setName("t-2");
		MyThread t3=new MyThread();
		t3.setName("t-3");
		MyThread t4=new MyThread();
		t4.setName("t-4");
		t4.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
