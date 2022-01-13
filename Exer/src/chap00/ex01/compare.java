package chap00.ex01;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    int min = 0;
    int max = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("숫자1 입력:");
    num1 = scan.nextInt();
    System.out.print("숫자2 입력:");
    num2 = scan.nextInt();
	
    if( num1 > num2 ) {
        max = num1;
        min = num2;
    } else {
    	max = num2;
        min = num1;
    }

    System.out.println("두 정수 중 큰 수는 "+max+"입니다.");
    System.out.println("두 정수 중 작은 수는 "+min+"입니다.");

  }

}

