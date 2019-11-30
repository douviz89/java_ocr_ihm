package telusko.threads;

public class ThreadDemo {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t2.start();

	}
}
