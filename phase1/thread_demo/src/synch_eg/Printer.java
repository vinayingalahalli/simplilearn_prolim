package synch_eg;

public class Printer {

	public static synchronized void printMessage(Message message) {
		
		System.out.print(message.getMessage1());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(" "+message.getMessage2());
	}
}
//explore on inter thread communcation methods - wait() notify() notifyALL()
//try to go over producer-consumer problem.....