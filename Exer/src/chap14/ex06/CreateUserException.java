package chap14.ex06;

// 1. 사용자 일반 예외
class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

// 2. 사용자 실행 예외
class MyRTException extends RuntimeException {
	public MyRTException () {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}

// 3. 사용자 정의 예외 객체 생성
class A {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메시지: MyRTException");
	
	// 4. 예외 던지기(throw): 던진 시점에서 예외 발생
	// (1) 예외 직접 처리
	void abc_1(int num) {
		try {
			if(num > 70)
				System.out.println("정상 작동");
			else
				throw me1;
		} catch (MyException e) {
			System.out.println("예외 처리1");
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException {
		if(num > 70)
			System.out.println("정상 작동");
		else
			throw me1;
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외 처리2");
		}
	}
}

public class CreateUserException {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		a.bcd_2();
	}

}
