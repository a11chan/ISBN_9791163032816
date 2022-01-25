package chap17_3.hashSet;

import java.util.Objects;

class A extends Object {}
public class _HashCode {
	public static void main(String[] args) {
		A a = new A();
		System.out.printf("%x",a.hashCode()); // 3d012ddd
		System.out.println();
		System.out.println(a.toString()); // chap17_3.hashSet.A@3d012ddd
		
		System.out.println(Objects.hash(1,2,3)); // 30817
		System.out.println(Objects.hash(2,1,3)); // 31747
		System.out.println(Objects.hash("안녕")); // 1611052
		System.out.println(Objects.hash("방가")); // 1537302
	}

}
