import lejos.nxt.Motor;

public class Main{

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Motor.A.forward();
		Motor.B.setSpeed(1000);
	}

}
