import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {
	
    public static void main(String[] args) {
    	 Robot bob = new Robot();
    	bob.setSpeed(10);
   	 // 3. ask the user what color they would like the Robot to draw
    	 	String color = JOptionPane.showInputDialog("What color do you want me to use?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	 	if(color.equalsIgnoreCase("red")) {
    	 		bob.setPenColor(255,0,0);
    	 		
    	 	}
    	 	else if(color.equalsIgnoreCase("green")) {
    	 		bob.setPenColor(0, 255, 0);
    	 	}
    	 	else if(color.equalsIgnoreCase("blue")) {
    	 		
    	 		bob.setPenColor(0,0,255);
    	 	}
   	 // 2. set the pen width to 10
    	 bob.setPenWidth(10);
    	 bob.penDown();
   	 // 1. make the Robot draw a shape
    	 for(int i=0;i<6;i++) {
    		 bob.move(100);
    		 bob.turn(60);
    	 }
    }

}
