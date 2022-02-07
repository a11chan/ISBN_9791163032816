package chap14.ex03;

public class MultiCatch_2 {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
			int num = Integer.parseInt("10A");
		}
		catch (NumberFormatException | ArithmeticException e) {
			System.out.println("잘못된 입력입니다.");
		}
		catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} // 모든 예외는 Exception 클래스의 하위 클래스이므로 최하단에 배치
		// 그렇지 않으면 unreachable code 발생
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
