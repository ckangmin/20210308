package access;

public class Car {
	public int speed;
	public int gas;
	public String owner;
	
	public Car(int speed,int gas, String owner) {
		this.speed=speed;
		this.owner=owner;
		this.gas=gas;
	}
	
	public void getCarInfo() {
		System.out.println("스피드 :" + this.speed);
		System.out.println("연료 :" + this.gas);
		System.out.println("주인 :" + this.owner);
		
		
	}
	public void carAccel() {
		this.speed +=10;
		this.gas-=2;
		if(gas<=0) {
			System.out.println("연료부족");
			this.speed=0;
			this.gas=0;
			}
		
	}
	public void carBreak() {
		this.speed-=10;
		if(speed<=0) {
			System.out.println("차가 멈췄습니다.");
			this.speed=0;
		}
		
	}
}


