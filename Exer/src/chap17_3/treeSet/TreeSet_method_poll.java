package chap17_3.treeSet;

import java.util.TreeSet;

public class TreeSet_method_poll {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 50; i > 0; i -= 2)
			treeSet.add(i);
		System.out.println(treeSet.toString());
		// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
		// 42, 44, 46, 48, 50]

		// 데이터 꺼내기
		// pollFirst()
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize); // 25
		for (int i = 0; i < treeSetSize; i++)
			System.out.print(treeSet.pollFirst() + " ");
		// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 
		System.out.println();
		System.out.println(treeSet.size()); // 0

		// pollLast()
		for (int i = 50; i > 0; i-=2)
			treeSet.add(i);
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); // 25
		for (int i = 0; i < treeSetSize; i++)
			System.out.print(treeSet.pollLast() + " ");
		// 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 
		System.out.println();
		System.out.println(treeSet.size()); // 0
	}
}
