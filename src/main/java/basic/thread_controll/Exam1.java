package basic.thread_controll;

/**
 * Process안의 Main thread가 소멸되더라도
 * tread가 남아있다면 Process는 실행상태를 유지합니다.
 */
public class Exam1 {

	public static void main(String[] args) {

		Thread thread = new Thread(new BlockingTask());

		thread.start();
		thread.interrupt();
	}

	private static class BlockingTask implements Runnable {

		@Override
		public void run() {

			try {
				Thread.sleep(500000000);
			} catch (InterruptedException e) {
				System.out.println("Exiting blocking thread");

			}
		}
	}
}
