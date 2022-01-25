package chap17_3.treeSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_method_subSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 50; i > 0; i -= 2)
			treeSet.add(i);
		System.out.println(treeSet.toString());
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
		// 42, 44, 46, 48, 50]
		
		SortedSet<Integer> sSet = treeSet.headSet(20); // 20미만 데이터 추출
		System.out.println(sSet.toString());
		// [2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, false); // 20미만 데이터 추출
		System.out.println(nSet.toString());
		// [2, 4, 6, 8, 10, 12, 14, 16, 18]
		nSet = treeSet.headSet(20, true); // 20이하 데이터 추출
		System.out.println(nSet);
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		
		sSet = treeSet.tailSet(20);
		System.out.println(sSet); // 20 이상 데이터 추출
		
		nSet = treeSet.tailSet(20,false);
		System.out.println(nSet); // 20 초과 데이터 추출
		
		nSet = treeSet.tailSet(20,true);
		System.out.println(nSet); // 20 이상 데이터 추출
		
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString()); // 10이상 20미만 데이터 추출
		
		nSet = treeSet.subSet(10, true, 20, false); // 10이상 20미만 데이터 추출
		System.out.println(nSet);
		
		nSet = treeSet.subSet(10, false, 20, true); // 10초과 20이하 데이터 추출
		System.out.println(nSet);
		
		System.out.println(treeSet); // 기본 오름차순 정렬
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet); // 내림차순으로 변경
		// [50, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2]
		descendingSet = descendingSet.descendingSet();
		System.out.println(descendingSet); // 다시 원복
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
	}
}
