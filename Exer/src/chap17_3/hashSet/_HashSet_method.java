package chap17_3.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _HashSet_method {
	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<String>();
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println(hSet1.toString()); // [가, 나]
		
		Set<String> hSet2 = new HashSet<String>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString()); // [가, 다, 나]
		
		hSet2.remove("나");
		System.out.println(hSet2.toString()); // [가, 다]
		
		hSet2.clear();
		System.out.println(hSet2.toString()); // []
		
		System.out.println(hSet2.isEmpty()); // true
		
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("가");
		hSet3.add("다");
		hSet3.add("나");
		System.out.println(hSet3.contains("나")); // true
		System.out.println(hSet3.contains("라")); // false
		System.out.println(hSet3.size()); // 3
		
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " "); // 가 다 나
		}
		System.out.println();
		// for-each 구문, 데이터 대입 방향은 <-
		for(String s:hSet3) {
			System.out.print(s + " ");
		} // 가 다 나
		System.out.println();
		
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); // [가, 다, 나]
		
		// HashSet<E> 원소 개수 > String[]의 원소 개수
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1)); // [가, 다, 나]

		// HashSet<E> 원소 개수 < String[]의 원소 개수
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); // [가, 다, 나, null, null]
		// List<E>에서의 적용 방법과 동일
		
	}

}
