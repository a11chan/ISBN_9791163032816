package chap17_3.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyClassCompare {
	int data1;
	int data2;
	public MyClassCompare(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

public class TreeSet_method_comparator {
	public static void main(String[] args) {
		// TreeSet<E> 생성자 매개변수로 java.util.Comparator<T> 인터페이스 객체 제공
		TreeSet<MyClassCompare> treeSet5
			// TreeSet 생성자로 인터페이스 Comparator<T> 객체 전달
			= new TreeSet<MyClassCompare>(new Comparator<MyClassCompare>() {
					// 인터페이스 구현부(익명 이너클래스 방식 사용)
					public int compare(MyClassCompare obj1,MyClassCompare obj2) {
						if (obj1.data1 < obj2.data1)
							return -1;
						else if (obj1.data1 == obj2.data1)
							return 0;
						else return 1;
					}//추상 메서드 오버라이딩 구현 끝
				});//생성자 끝
		
		MyClassCompare myCls2 = new MyClassCompare(3,3);
		MyClassCompare myCls1 = new MyClassCompare(2,5);
		
		treeSet5.add(myCls2);
		treeSet5.add(myCls1);
		for (MyClassCompare element:treeSet5) {
			System.out.println(element.data1);
			// data1 기준 3, 2 순으로 담았지만 2, 3 순으로 출력
		}
		
	}//END:main()
}
