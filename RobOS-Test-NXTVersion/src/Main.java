import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.Sound;
import lejos.nxt.LCD;
public class Main {

	public static void main(String[] args) {
		MDraw G2d = new MDraw();
		//G2d.DrawHorz(10, 10, 100);
		MMuziek player = new MMuziek();
		player.IntroMuziek();
		G2d.FillRect(10, 10, 100, 100);
		
		//System.out.println("Booting");
		Button.waitForAnyPress();
		
		
		

	}
	
	

}
class MMuziek{
	public void IntroMuziek() {
		/*Sound.beep();
		Sound.pause(5);
		Sound.beep();
		Sound.playNote(Sound.PIANO, 700, 2000);
		Sound.pause(1000);
		Sound.playNote(Sound.PIANO, 600, 2000);
		
		
		Sound.playNote(Sound.PIANO, 700, 1000);
		Sound.playNote(Sound.PIANO, 600, 1000);
		Sound.playNote(Sound.PIANO, 900, 2000);
		
		//couplet een
		Sound.playNote(Sound.XYLOPHONE, 900, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1000, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1100, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1200, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1100, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1000, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1200, 500);
		Sound.pause(200);
		Sound.playNote(Sound.XYLOPHONE, 1100, 1000);
		Sound.playNote(Sound.XYLOPHONE, 1000, 1000);
		Sound.playNote(Sound.XYLOPHONE, 900, 1000);
		Sound.playNote(Sound.XYLOPHONE, 800, 2000);
		//intro xylo
		Sound.beep();
		Sound.pause(5);
		Sound.beep();
		Sound.playNote(Sound.XYLOPHONE, 700, 4000);
		Sound.pause(1000);
		Sound.playNote(Sound.XYLOPHONE, 600, 4000);
		
		
		Sound.playNote(Sound.XYLOPHONE, 700, 4000);
		Sound.playNote(Sound.XYLOPHONE, 600, 4000);
		Sound.playNote(Sound.XYLOPHONE, 900, 4000);
		
		
		/*Sound.playNote(Sound.PIANO, 900, 1000);
		Sound.playNote(Sound.PIANO, 800, 1000);
		Sound.playNote(Sound.PIANO, 700, 1000);
		Sound.playNote(Sound.PIANO, 600, 1000);
		Sound.playNote(Sound.PIANO, 500, 1000);
		Sound.playNote(Sound.PIANO, 400, 1000);*/
		
		}
}
class MDraw{
	
	public void DrawHorz(int xbegin,int ybegin, int xeind) {
		for(int x=0+xbegin; x<xeind-xbegin;x++){
			
		LCD.setPixel(x, ybegin, 1); }
	}
	public void DrawVert(int xbegin,int ybegin, int xeind) {
		for(int x=0+xbegin; x<xeind-xbegin;x++){
			
		LCD.setPixel(x, ybegin, 1); }
	}
	
	public void FillRect(int xbegin, int ybegin, int hoogte, int Breed){
		for(int h = 0; h< hoogte; h++){

			int xd = h+xbegin;
			int yd = h+ybegin;
			int bd = h+Breed;
			
			DrawHorz(xd,yd,bd);
		//	System.out.println("test"+h);

			
		}
	}
}
class Control extends Thread{
	public void schiet(int aantal){ //testmethode om te kijken of alles goed werkt, en omdat het awesome is...
		for(int i=0;i==1;i++){
			Motor.C.forward();
			
		}
	} //woll

	public String s() {
		
		Motor.C.forward();
		return "helloworld";
	}
}


