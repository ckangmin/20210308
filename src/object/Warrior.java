package object;

public class Warrior {
	public int level;
	public int atk;
	public int hp;
	public String id;
	
	public void getStatus() {
		System.out.println("아이디 : "+id);
		System.out.println("레벨 : "+level);
		System.out.println("체력 : "+hp);
		System.out.println("공격력 : "+atk);
		
		
	}
	public Warrior(String userId) {
		System.out.println("전사 아이디 생성중입니다....");
		level=1;
		hp=20;
		atk=3;
		id=userId;
		
	}
	public void hunt() {
		level+=1;
		hp-=3;
		System.out.println("사냥에 완료했습니다.");
		System.out.println("정보창");
		getStatus();
	}
}
