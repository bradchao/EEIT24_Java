package tw.brad.java;

import java.util.Timer;
import java.util.TimerTask;

public class Brad63 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask mTask = new MyTask(timer);
		MyTask2 mTask2 = new MyTask2();
		
		timer.schedule(mTask2, 0, 500);
		
		timer.schedule(mTask, 3*1000);
		System.out.println("Main");
	}
}

class MyTask extends TimerTask {
	Timer timer;
	MyTask(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		System.out.println("OK");
		timer.cancel();
	}
}
class MyTask2 extends TimerTask {
	int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}

