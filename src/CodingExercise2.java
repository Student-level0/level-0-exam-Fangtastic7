

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int x = Integer.parseInt(age);
	if(x<=30) {
		x = 2018-x;
		System.out.println("You were born in the year " + x + " .");
	}
	else if(x>30) {
		JOptionPane.showMessageDialog(null, "You are too old to play this game!");
	}
	else {
		JOptionPane.showMessageDialog(null, "I do not know what you are.");
	}
	}

}



