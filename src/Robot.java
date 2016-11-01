/**
 * Robot has two arms that can be manipulated.
 * @author mcolinj
 *
 */
public class Robot {
	RobotArm left;
	RobotArm right;
	public Robot() {
		this.left = new RobotArm(0);
		this.right = new RobotArm(1);
	}
	
	public String asString() {
		return "Robot\n" +
				"Left" + this.left.asString() + "\n" +
				"Right" + this.right.asString();
	}
	
	public void surrender() {
		this.left.reset();
		this.right.reset();
		this.left.openHand();
		this.right.openHand();
		for (int i=1; i<RobotArm.maxAngle; i++) {
			this.left.raise();
			this.right.raise();
		}
	}
	
	public void woot() {
		this.left.reset();
		this.right.reset();
		this.left.closeHand();
		this.right.closeHand();		
		for (int i=1; i<RobotArm.maxAngle; i++) {
			this.left.raise();
			this.right.raise();
		}
	}
	
}
