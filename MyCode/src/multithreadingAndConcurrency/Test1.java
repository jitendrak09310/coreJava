package multithreadingAndConcurrency;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(() -> {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Interrupted.. : ");
			}
			System.out.println("Done Sleeping...");
		});

		t.start();
		t.join();// It makes the thread t to finish then proceed further..
		System.out.println("After Join..");

	}

}
