package chap16.ex06;

class A {}
class B extends A {}
class C extends B {}

class D <T extends B> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
		
		D<B> d2 = new D<>(); //B타입으로 객체 생성
		D<C> d3 = new D<>();
		D d4 = new D(); // D<B>형으로 객체 생성과 동일
		
		d2.set(new B());
		d2.set(new C());
		
		// d3.set(new B()); B객체 안에 C객체가 없어서 오류
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C()); // C객체 안에 B객체가 있으므로 B형으로 생성 가능
	}

}
