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
