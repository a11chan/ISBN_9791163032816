package chap17_3.treeSet;

import java.util.TreeSet;

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

public class TreeSet_method_size {
	public static void main(String[] args) {
		
		// TreeSet<E>에서 Integer 객체의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = Integer.valueOf(20);
		Integer intValue2 = Integer.valueOf(10);
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		System.out.println(treeSet1.toString()); // [10, 20]
		
		// TreeSet<E>에서 String 객체의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = "가나";
		String str2 = "다라";
		treeSet2.add(str1);
		treeSet2.add(str2);
		System.out.println(treeSet2.toString()); // [가나, 다라]
		
		// 일반 객체 크기 비교
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treeSet3.add(myClass1); // 예외 발생
		treeSet3.add(myClass2); // 예외 발생
		System.out.println(treeSet3.toString()); // 예외 발생
		// ∵크기를 비교하는 기준이 불명확
	}
}
