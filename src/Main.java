
public class Main {
	public static void main(String[] args) {
		
		// Create robot in initial state
		Robot theRobot = new Robot();
		System.out.println("Initial State\n" + theRobot.asString());
		
		// surrender
		theRobot.surrender();
		System.out.println("Surrendered\n" + theRobot.asString());
		
		// celebrate!
		theRobot.woot();
		System.out.println("Woot!\n" + theRobot.asString());	
		
	}
}
