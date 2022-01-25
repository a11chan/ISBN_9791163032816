package chap17_3.hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class BothOverTest {
	int data;
	public BothOverTest(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BothOverTest) {
			if (this.data == ((BothOverTest) obj).data)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data); // == return (new Integer(data)).hashCode();
	}
}

public class BothOver {
	public static void main(String[] args) {
		Set<BothOverTest> hashSet3 = new HashSet<>();
		BothOverTest t1 = new BothOverTest(3);
		BothOverTest t2 = new BothOverTest(3);
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // true
		System.out.println(t1.hashCode()+" "+t2.hashCode()); // 34 34
		
		hashSet3.add(t1);
		hashSet3.add(t2);
		System.out.println(hashSet3.size()); // 1 -> 동일 객체로 인식
	}

}
