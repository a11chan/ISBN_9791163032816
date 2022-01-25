package chap17_3.hashSet;

import java.util.HashSet;
import java.util.Set;

class NotOver {
	int data;
	public NotOver(int data) {
		this.data = data;
	}
}

public class NotOver_hashCodeAndequals {
	public static void main(String[] args) {
		Set<NotOver> hashSet1 = new HashSet<>();
		NotOver notOver1 = new NotOver(3);
		NotOver notOver2 = new NotOver(3);
		System.out.println(notOver1 == notOver2); // false
		System.out.println(notOver1.equals(notOver2)); // false
		System.out.println(notOver1.hashCode() + " " + notOver2.hashCode()); // 1365202186 1651191114
		hashSet1.add(notOver1);
		hashSet1.add(notOver2);
		System.out.println(hashSet1.size()); // 2(서로 다른 객체)
	}

}
