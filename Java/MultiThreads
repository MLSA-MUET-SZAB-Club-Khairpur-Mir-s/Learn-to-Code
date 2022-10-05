
public class MultiThreads implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		MultiThreads mT = new MultiThreads();
		Thread t1 = new Thread(mT);
		t1.setName("T1");
		Thread t2 = new Thread(mT);
		t2.setName("T2");
		Thread t3 = new Thread(mT);
		t3.setName("T3");
		t1.start();
		t2.start();
		t2.join();
		t3.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hi "  + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
			}
		}
	}

}
