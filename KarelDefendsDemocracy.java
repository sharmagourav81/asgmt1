/**
* Merit America Assignment #1 Karel Defends Democracy
* This program will remove Chads from the voting cards
* @author Gourav Sharma
* 
*/

package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				cleanChads();
			}
			move();
		}	
		
	}
	
	/**
	 * This method checks for and picks up chads above and below the 'centeral path'
	 * The precondition is that it is in the central path, facing East.
	 * Upon completion, it will have returned to its original position prior to the running the method.
	 *  
	 */
	
	public void cleanChads() {
		cleanUp();
		cleanDown();
	}
	public void cleanUp() {
		turnLeft();
		move();
		clearChads();
		move();
		turnLeft();
	}
	public void cleanDown() {
		turnRight();
		move();
		clearChads();
		move();
		turnRight();
	}
	public void clearChads() {
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
	}
}
