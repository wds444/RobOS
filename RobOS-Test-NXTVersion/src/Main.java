import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.Sound;
import lejos.nxt.LCD;

public class Main {
	public int STRAAL = 4;
	public int FACTOR = 3;

	public static void main(String[] args) {
		//MDraw G2d = new MDraw();
		// G2d.DrawHorz(10, 10, 100);
		//MMuziek player = new MMuziek();
		//player.IntroMuziek();
		// G2d.FillRect(10, 10, 100, 100);
		System.out.println("Booting Controller");
		Control c = new Control();
		c.goForward(10);
		c.schiet(2);
		c.goBackward(10);
		Button.waitForAnyPress();

	}

}

class MMuziek {
	public void IntroMuziek() {
		/*
		 * Sound.beep(); Sound.pause(5); Sound.beep();
		 * Sound.playNote(Sound.PIANO, 700, 2000); Sound.pause(1000);
		 * Sound.playNote(Sound.PIANO, 600, 2000);
		 * 
		 * 
		 * Sound.playNote(Sound.PIANO, 700, 1000); Sound.playNote(Sound.PIANO,
		 * 600, 1000); Sound.playNote(Sound.PIANO, 900, 2000);
		 * 
		 * //couplet een Sound.playNote(Sound.XYLOPHONE, 900, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1000, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1100, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1200, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1100, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1000, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1200, 500);
		 * Sound.pause(200); Sound.playNote(Sound.XYLOPHONE, 1100, 1000);
		 * Sound.playNote(Sound.XYLOPHONE, 1000, 1000);
		 * Sound.playNote(Sound.XYLOPHONE, 900, 1000);
		 * Sound.playNote(Sound.XYLOPHONE, 800, 2000); //intro xylo
		 * Sound.beep(); Sound.pause(5); Sound.beep();
		 * Sound.playNote(Sound.XYLOPHONE, 700, 4000); Sound.pause(1000);
		 * Sound.playNote(Sound.XYLOPHONE, 600, 4000);
		 * 
		 * 
		 * Sound.playNote(Sound.XYLOPHONE, 700, 4000);
		 * Sound.playNote(Sound.XYLOPHONE, 600, 4000);
		 * Sound.playNote(Sound.XYLOPHONE, 900, 4000);
		 * 
		 * 
		 * /*Sound.playNote(Sound.PIANO, 900, 1000); Sound.playNote(Sound.PIANO,
		 * 800, 1000); Sound.playNote(Sound.PIANO, 700, 1000);
		 * Sound.playNote(Sound.PIANO, 600, 1000); Sound.playNote(Sound.PIANO,
		 * 500, 1000); Sound.playNote(Sound.PIANO, 400, 1000);
		 */

	}
}

class MDraw {

	public void DrawHorz(int xbegin, int ybegin, int xeind) {
		for (int x = 0 + xbegin; x < xeind - xbegin; x++) {

			LCD.setPixel(x, ybegin, 1);
		}
	}

	public void DrawVert(int xbegin, int ybegin, int xeind) {
		for (int x = 0 + xbegin; x < xeind - xbegin; x++) {

			LCD.setPixel(x, ybegin, 1);
		}
	}

	public void FillRect(int xbegin, int ybegin, int hoogte, int Breed) {
		for (int h = 0; h < hoogte; h++) {

			int xd = h + xbegin;
			int yd = h + ybegin;
			int bd = h + Breed;

			DrawHorz(xd, yd, bd);
			// System.out.println("test"+h);

		}
	}
}

class Control extends Thread {
	Control(){
	Motor.A.setAcceleration(300);
	Motor.B.setAcceleration(300);}
	
	public void schiet(int aantal) { // testmethode om te kijken of alles goed
		int rotate = 0;
		System.out.println("fire systems booted");
		for (int i = 0; i <= aantal; i++) {
			rotate = rotate +360;
		}
		Motor.C.rotate(rotate);
	}

	public void goForward(int afst) {
		int rotate = 0;
		System.out.println("controller booted");
		for (int i = 0; i <= afst; i++) {
			
			rotate = rotate +100;
		}
		Motor.A.rotate(rotate, true);
		Motor.B.rotate(rotate, false);
	}

	public void goBackward(int afst) {
		
		int rotate = 0;
		System.out.println("controller booted");
		for (int i = 0; i <= afst; i++) {
			
			rotate = rotate +100;
		}
		Motor.A.rotate(-rotate, true);
		Motor.B.rotate(-rotate, false);
	}
}
