package basic.thread_creation;

import java.util.ArrayList;
import java.util.List;

public class Exam2 {

	private final List<Runnable> tasks;

	public Exam2(List<Runnable> tasks) {
		this.tasks = tasks;
	}

	public void executeAll() {
		List<Thread> threads = new ArrayList<>(tasks.size());

		for (Runnable task : tasks) {
			Thread thread = new Thread(task);
			threads.add(thread);
		}

		for(Thread thread : threads) {
			thread.start();
		}
	}
}
