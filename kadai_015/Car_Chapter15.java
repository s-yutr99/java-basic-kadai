package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	private int beforeGear = 1;
	
	
	
	public void changeGear (int afterGear) {
		this.beforeGear = this.gear;
		
		this.gear = afterGear;
		switch (gear) {
		case 1 -> speed = 10 ;
		case 2 -> speed = 20 ;
		case 3 -> speed = 30 ;
		case 4 -> speed = 40 ;
		case 5 -> speed = 50 ;
		default -> speed = 10 ;
		}
		}
		
		public void run () {
			System.out.println("ギア" + beforeGear + "から"+ gear + "に切り替えました");
			System.out.println("速度は時速" + speed + "kmです");
		
	}
		
}