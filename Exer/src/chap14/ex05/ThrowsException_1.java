package chap14.ex05;

public class ThrowsException_1 {
	
	// 예외를 호출 메서드로 전가할 때
	class B {
		void abc() {
			try {
				bcd();
			} catch (InterruptedException e) {
				
			}
		}
		void bcd() throws InterruptedException {
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {

	}

}
