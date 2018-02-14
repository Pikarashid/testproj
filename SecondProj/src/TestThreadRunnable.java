import java.time.LocalDateTime;

public class TestThreadRunnable implements Runnable { //the implements use to inheritance Runnable from TestThreadRunnable.

	public static void main(String[] args) { //main is default thread.
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ": This is currently running on the main thread, " +
				"the id is: " + Thread.currentThread().getId());
		TestThreadRunnable worker = new TestThreadRunnable();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		ldt = LocalDateTime.now();
		System.out.println(ldt + ": Main finished running....");
		
	}
	
	@Override
	public void run()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ": This is currently running on a separate thread, " +
				"the id is: " + Thread.currentThread().getId());
	

	}

}
