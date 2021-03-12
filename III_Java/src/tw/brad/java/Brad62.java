package tw.brad.java;

public class Brad62 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyRunnerable mr1 = new MyRunnerable("C");
		Thread t1 = new Thread(mr1);
		mt1.start();
		mt2.start();
		t1.start();
		
		System.out.println("main");
	}

}

class MyThread extends Thread {
	String name;
	MyThread(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":"+ i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

class MyRunnerable implements Runnable {
	String name;
	MyRunnerable(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":"+ i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
	}	
}


