package thread.basic;

//임의의 변수를 선언해서 쓰레드 종료하기
class StopThread01 extends Thread{
	private boolean state = true;
	public void run() {
		while(state) {
			System.out.println("쓰레드 실행중~~~~");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("현재상태 : 종료상태로 들어감.....");
	}
	//쓰레드의 상태를 조절할 수 있도록 변수의 값을 변경하는 메소드
	public void stopThread() {
		state = false;
	}
}
public class StopThreadTest01 {

	public static void main(String[] args) {
		System.out.println("******main 쓰레드 시작******");
		StopThread01 t1 = new StopThread01();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("******main 쓰레드 종료******");
	}

}
