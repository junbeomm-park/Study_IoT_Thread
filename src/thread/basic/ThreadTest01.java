package thread.basic;

class ThreadDemo1 extends Thread{
	ThreadDemo1(String name){
		super(name);
	}
	@Override
	public void run() {
		//1부터 20까지 출력하는 코드
		for (int i = 0; i <= 20; i++) {
			System.out.print(i+"("+getName()+")");
			if(i%5==0) {
				System.out.println();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
//ThreadDemo01객체를 활용해서 멀티쓰레드 프로그래밍을 구현
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*****************프로그램시작*********************");
		ThreadDemo1 t1 = new ThreadDemo1("t1");
		ThreadDemo1 t2 = new ThreadDemo1("t2");
		//t1.run(); -> 단순한 메소드 호출(쓰레드프로그래밍 XXXX)
		t1.start();
		t2.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("*****************프로그램종료**********************");
	}
}
