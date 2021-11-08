package thread.basic;

class Super2 {
	
}
//이미 상속하고 있는 클래스가 있는 경우 Thread프로그래밍을 하기 위해서 Runnalbe인터페이스를 상속한다.
class AlphaThread2 extends Super implements Runnable{
	
	@Override
	public void run() {
		
			for (char i = 'a'; i <= 'z'; i++) {
				System.out.print(i+"("+Thread.currentThread().getName()+")");
				if(i%10==0) {
					System.out.println();
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
class DigitThread2 extends Super implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.print(i+"("+Thread.currentThread().getName()+")");
			if(i%10==0) {
				System.out.println();
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class RunnableTest02 {
	public static void main(String[] args) {
		System.out.println("*****************프로그램시작**********************");
		AlphaThread2 obj1 = new AlphaThread2();
		DigitThread2 obj2 = new DigitThread2();
		
		Thread t1 = new Thread(new AlphaThread2());
		Thread t2 = new Thread(new DigitThread2());
		t1.start();
		t2.start();
	
		System.out.println("*****************프로그램종료**********************");
	}


}


