import java.io.*;

import lejos.nxt.*;
import lejos.nxt.comm.*;

public class Main 

{
  public static void main(String[] args) throws IOException { 
    LCD.drawString("right BT",0, 0);
    NXTConnection connection = null;

    if(Button.waitForAnyPress() == Button.ID_RIGHT){
      LCD.drawString("waiting for BT", 0,1 );
      connection = Bluetooth.waitForConnection();
    } else {
      LCD.drawString("waiting for USB", 0,1 );
      connection = USB.waitForConnection();
    }
    System.out.println("Connection made");

    DataOutputStream Out = connection.openDataOutputStream();
    DataInputStream In = connection.openDataInputStream();
    Controller control = new Controller(Out, In);
  }   
}
class Controller{
	private int cmd1,cmd2,cmd3,cmd0;
	private NXTRegulatedMotor motorL= Motor.A,motorR= Motor.B, motorF = Motor.C;
	private boolean connected = true;
	private DataInputStream Input;
	private DataOutputStream Output;
	public Controller(DataOutputStream Out,DataInputStream In) throws IOException{
		System.out.println("Controller Activated");
		Input = In;
		Output = Out;
		while(connected == true){
			int check = Input.read();
			System.out.println(check);
			int Arot = 0;
			int Brot = 0;
			motorL.setSpeed(500);
			motorR.setSpeed(500);
			motorR.setSpeed(900);
			
			
			if (check == 1){Arot = Arot +500;Brot = Brot +500;motorL.rotate(Arot,true);motorR.rotate(Brot,false);}
			if (check == 2){motorL.setSpeed(700);Arot = Arot +800;Brot = Brot +500;motorL.rotate(Arot,true);motorR.rotate(Brot,false);}
			if (check == 3){motorR.setSpeed(700);Brot = Brot +800;Arot = Arot +500;motorL.rotate(Arot,true);motorR.rotate(Brot,false);}
			if (check == 4){Arot = Arot -500;Brot = Brot -500;motorL.rotate(Arot,true);motorR.rotate(Brot,false);}
			if (check == 5){motorF.rotate(360, false);}
			
			
			
			
			
			
		}}
		
	}