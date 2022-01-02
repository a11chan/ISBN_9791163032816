package chap10;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			if ( ((A) obj).data == this.data) {
				return true;
			}
		}
		return false;
	}
}

public class Exer {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
	}

}
