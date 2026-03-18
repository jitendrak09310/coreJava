package multithreadingAndConcurrency;

public class Test4 {
	static volatile boolean flag = false;

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(() -> {
			while (!flag) {
				System.out.println("Flag seen!");
			}
		});
		t.start();
		Thread.sleep(10);
		flag = true;
		t.join();
		System.out.println("Done");
	}

}
