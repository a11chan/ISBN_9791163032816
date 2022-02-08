package chap14.ex05;

public class ThrowsException_2 {
	
	// JVM에 예외 전가
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object2");
		Thread.sleep(1000);
		System.out.println(cls);
	} // JVM은 발생한 예외의 정보를 화면에 출력하고 프로그램을 강제 종료함

}
