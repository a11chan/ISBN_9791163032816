package chap17_3.treeSet;

import java.util.TreeSet;

public class TreeSet_method {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i = 50; i > 0;i -= 2)
			treeSet.add(i);
		System.out.println(treeSet.toString());
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		// 데이터 검색
		System.out.println(treeSet.first()); // 2
		System.out.println(treeSet.last()); // 50
		System.out.println(treeSet.lower(26)); // 입력값보다 작은 첫 번째 값 -> 24
		System.out.println(treeSet.higher(26)); // 입력값보다 큰 첫 번재 값 -> 28
		System.out.println(treeSet.floor(25)); // 입력값보다 작거나 같은 첫 번째 값 -> 24
		System.out.println(treeSet.floor(26)); // 26
		System.out.println(treeSet.ceiling(25)); // 입력값보다 크거나 같은 첫 번재 값 26
		System.out.println(treeSet.ceiling(26)); // 26
		System.out.println();
		
	}
}
