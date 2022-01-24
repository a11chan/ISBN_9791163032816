package chap00.ex01;

public class PigSave {
  private int money;
	
  public void deposit(int money) {
    this.money += money;
    System.out.println("돼지 저금통에 돈을 "+money+"원 입금한다.");
  }
	
  public int getMoney() {
    System.out.println("돼지 저금통의 총액을 찾는다");
    return money;
  }

  public void withdraw() {
    System.out.println("돼지 저금통을 버린다.");
    this.money = 0;
    System.out.println("현재 잔액은 "+this.money+"원입니다.");
  }
  
  public static void main(String[] args) {
    PigSave pig = new PigSave();
    pig.deposit(20000);
    pig.deposit(20000);
    System.out.println();
    
    int moneyBack = pig.getMoney();
    System.out.println("찾은 금액은 "+moneyBack+"원입니다.");
    System.out.println();
    
    pig.withdraw();
  }

} // end:class