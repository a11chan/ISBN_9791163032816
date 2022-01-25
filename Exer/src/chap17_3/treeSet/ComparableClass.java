package chap17_3.treeSet;

import java.util.TreeSet;

public class ComparableClass implements Comparable<ComparableClass> {
	int data1;
	int data2;
	public ComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	// data2와는 상관없이 data1만으로 크기를 결정하는 예
	@Override
	public int compareTo(ComparableClass targetClass) {
		if (data1 < targetClass.data1)
			return -1;
		else if (data1 == targetClass.data1)
			return 0;
		else return 1;
	}
	
	public static void main(String[] args) {
		TreeSet<ComparableClass> treeSet4 = new TreeSet<ComparableClass>();
		ComparableClass myComClass1 = new ComparableClass(2, 5);
		ComparableClass myComClass2 = new ComparableClass(3, 3);
		treeSet4.add(myComClass1);
		treeSet4.add(myComClass2);
		// 향상된 for문, 데이터 대입 방향: 원소 <- 집합
		for (ComparableClass eachElement:treeSet4) {
			System.out.println(eachElement.data1); // 2 -> 3
		}
	}

}
