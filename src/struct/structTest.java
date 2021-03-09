package struct;

public class structTest {
	
	
	public static void getStatus(structEx ac) {
		System.out.println("id :"+ ac.id);
		System.out.println("atk :"+ ac.atk);
		System.out.println("hp :"+ ac.hp);
		System.out.println("level :"+ ac.level);
	
		
		
	}
	public static void getMagicianStatus(Magician ac) {
		System.out.println("id :"+ ac.id);
		System.out.println("atk :"+ ac.atk);
		System.out.println("mp :"+ ac.mp);
		System.out.println("level :"+ ac.level);
	
		
		
	}
	public static void huntMonster(structEx ac) {
		 System.out.println("전사가 몬스터를 잡습니다.");
		 ac.hp-=3;
		 ac.level +=1;
	}
	
	public static void main(String[] args) {
		structEx w1= new structEx();
		w1.atk=3;
		w1.hp=20;
		w1.level=1;
		w1.id="전사1";
		getStatus(w1);
		System.out.println("--------------------");
		structEx w2= new structEx();
		w2.atk=5;
		w2.hp=40;
		w2.level=3;
		w2.id="전사2";
		getStatus(w2);
		System.out.println("--------------------");
		Magician w3=new Magician();
		w3.id= "해리포터";
		w3.level=999;
		w3.mp=30;
		w3.atk=1;
		getMagicianStatus(w3);
	}

	
	
}
