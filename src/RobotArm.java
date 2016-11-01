/**
 * Robot arm can extend from minAngle to maxAngle
 * degrees.   It can open and close its hand.
 */

/**
 * @author mcolinj
 *
 */
public class RobotArm {
	static final int minAngle = 0;
	static final int maxAngle = 180;
	int angle;
	RobotHand hand;
	
	public RobotArm(int angle) {
		this.angle = angle;
		this.hand = new RobotHand();
	}

	void reset() {
		this.angle = minAngle;
		this.hand.reset();
	}
	
	void openHand() {
		if (this.hand.isClosed()) {
			this.hand.open();
		}
	}
	void closeHand() {
		if (this.hand.isOpen()) {
			this.hand.close();
		}
	}
	void raise() {
		this.angle += 1;
	}
	
	public String asString() {
		return "arm angle is "+this.angle+" and "+this.hand.asString();	
	}
	
}
