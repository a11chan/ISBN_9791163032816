package chap16.ex01;
class Apple{}
class Pencil{}
class Goods2 {
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = (Pencil)goods2.getPencil();
	}

}
