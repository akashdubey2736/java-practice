package practice.java.concurrency.challenge;


class OddThread extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print("Odd Thread : ");
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("OddThread interrupted!");
				}
			}
		}
	}
	
}

class EvenThread implements Runnable{

	@Override
	public void run() {
		
		for (int i=1 ;i<=10;i++) {
			if(i%2==0) {
				System.out.print("Even Thread : ");
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("EvenThread interrupted!");
				}
			}
			
		}
		
		
	}
	
}

public class Main {
	

	public static void main(String[] args) {
		
		OddThread oddThread=new OddThread();
		Thread evenThread=new Thread(new EvenThread());
		oddThread.start();
		evenThread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		oddThread.interrupt();
	
	}

}
