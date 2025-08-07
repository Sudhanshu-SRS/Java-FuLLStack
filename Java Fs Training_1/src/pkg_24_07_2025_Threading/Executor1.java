package pkg_24_07_2025_Threading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Executor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService es=Executors.newFixedThreadPool(10);
for(int i=0; i<100;i++) {
	es.execute(new Task());
	System.out.println(Thread.currentThread().getName());
	
}
	}
	static class Task implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
