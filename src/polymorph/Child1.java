package polymorph;

public class Child1 extends Parent {
	
	@Override
	public void showNum() {
		System.out.println("부모의 showNum입니다.");
		//System.out.println(super.showNum());
		System.out.println("=================");
	}
}
