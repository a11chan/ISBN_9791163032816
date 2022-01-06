package chap13.ex05;

class A {
	interface B { // 이너 인터페이스는 자동으로 static 지정
		public abstract void bcd();
	}
}

class C implements A.B {
	public void bcd() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}

public class InnerInterface {
	public static void main(String[] args) {
		A.B ab = new C();
		ab.bcd();
			
		A.B ab2 = new A.B() {
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성");
			}
		};
		ab2.bcd();
	}

}
