package pkg_24_07_2025_Threading;

public class Tradition1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread t=new Thread(new Task());
			t.start();
			
		}
System.out.println("main():"+Thread.currentThread().getName());
	}
static class Task implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
}
