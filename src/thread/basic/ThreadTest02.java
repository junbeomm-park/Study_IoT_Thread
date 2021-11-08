package thread.basic;

class DigitThread extends Thread{
	DigitThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i+"("+getName()+")");
			if(i%10==0) {
				System.out.println();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class AlphaThread extends Thread{
	AlphaThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+"("+getName()+")");
			if(i%10==0) {
				System.out.println();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println("*****************프로그램시작*********************");
		DigitThread t1 = new DigitThread("digit");
		AlphaThread t2 = new AlphaThread("alpha");
		
		t1.start();
		t2.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*****************프로그램종료**********************");
	}
}
