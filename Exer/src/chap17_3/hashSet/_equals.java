package chap17_3.hashSet;

class B {
	int data;
	public B(int data) {
		this.data = data;
	}
}

public class _equals {
	public static void main(String[] args) {
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2); // false
		System.out.println(b1.equals(b2)); // false
	}

}
