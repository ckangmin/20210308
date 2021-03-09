package object;

public class Magician {

	public int level;
	public int mp;
	public int hp;
	public String name;
	
	
	public  Magician( String Sname) {
		level=1;
		mp=50;
		hp=40;
		name=Sname;
	}
	
	public void getStatus() {
		System.out.println("name :" +name);
		System.out.println("level :" +level);
		System.out.println("hp :" +hp);
		System.out.println("mp :" +mp);
		
	}
	public void hunt() {
		System.out.println("사냥을 시작합니다.");
		System.out.println("사냥을 완료.");
		level+=1;
		mp-=10;
		hp-=15;
		System.out.println("현재 상태창.");
		getStatus();
		
	}
	public void heal() {
		System.out.println("휴식을 시작합니다.");
		mp+=10;
		hp+=15;
		System.out.println("휴식완료");
		System.out.println("현재상태");
		getStatus();
		
	}
}
