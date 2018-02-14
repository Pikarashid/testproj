import java.time.LocalDateTime;

public class TestThreadThread extends Thread { //creating the Thread as inheritance the results still same.

	public static void main(String[] args) { //main is default thread.
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ": This is currently running on the main thread, " +
				"the id is: " + Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.setName("T2");
		t2.setPriority(MIN_PRIORITY);
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.setName("T4");
		t4.setPriority(MAX_PRIORITY);
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
				"the id is: " + Thread.currentThread().getId()
				+ ", with Name :" + Thread.currentThread().getName()
				+ ", ith Priority  :" + Thread.currentThread().getPriority());
		
		for (int i=0;i<1000;i++) {
			//Do nothing
	
		}
		
		System.out.println(ldt + ": Thread with id is: " + Thread.currentThread().getId()
				+ ", with Name :" + Thread.currentThread().getName()
				+ " Finished Executing " );
		
	

	}

}
