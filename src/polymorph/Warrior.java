package polymorph;

public class Warrior {
	private int hp;
	private int atk;
	private int def;
	
	public Warrior(int hp,int atk,int def) {
		this.hp=hp;
		this.atk=atk;
		this.def=def;
	}
	
	public void hunt(Monster mon) {
		System.out.println("몬스터와의  전투가 시작됬습니다.");
		mon.setHp(mon.getHp()-this.atk);
		this.hp=this.hp-mon.getAtk();
		System.out.println("HP 상태");
		ShowHp(mon);
	}
	

	public void ShowHp(Monster mon) {
		System.out.println("Warrior Hp : " +this.hp);
		System.out.println("Monster HP : "+mon.getHp());
		
	}
}
