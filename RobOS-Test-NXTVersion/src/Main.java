import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


class Control extends Thread{
	public void schiet(int aantal){ //testmethode om te kijken of alles goed werkt, en omdat het awesome is...
		for(int i=0;i==1;i++){
			Motor.C.forward();
			
		}
	}

	public String s() {
		
		Motor.C.forward();
		return "helloworld";
	}
}

public class Main{
	
	public static void main(String[] args) {
		System.out.println("test");
		Control c = new Control();
		c.schiet(2);
		System.out.println(c.s());
		Button.waitForAnyPress();
	}

}

