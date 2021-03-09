package polymorph;

public class Monster  {
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	private int hp;
	private int atk;
	private int def;
	
	public Monster(int hp, int atk, int def) {
		this.hp= hp;
		this.atk=atk;
		this.def=def;
	}
	public void showHP() {
		System.out.println("몬스터의 체력 : " +this.hp);
	}
	
}
