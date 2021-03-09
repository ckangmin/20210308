package polymorph;

public class GameMain {
public static void main(String[] args) {
	Warrior wa=new Warrior(50, 4, 5);
//	Orc or=new Orc();
//	wa.ShowHp();
//	or.ShowHp();
//	wa.hunt(or);
//	or.ShowHp();
	Dragon dra=new Dragon();

	wa.hunt(dra);

	
}
}
