package chap17_3.hashSet;

import java.util.HashSet;
import java.util.Set;

class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if (this.data == ((C) obj).data)
				return true;
		}
		return false;
	}
}

public class EqualsOver {
	public static void main(String[] args) {
	// equals(): 오버라이딩 + hashCode(): 오버라이딩X
		Set<C> hashSet2 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2); // 위치값 비교 false
		System.out.println(c1.equals(c2)); // 필드값 비교 true
		System.out.println(c1.hashCode()+" "+c2.hashCode()); // 1365202186 1651191114
		hashSet2.add(c1);
		hashSet2.add(c2);
		System.out.println(hashSet2.size()); // 2 -> 다른 객체로 인식
	}

}
