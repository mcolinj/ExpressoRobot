import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void test() {
		Robot rbt = new Robot();
		assert(rbt.leftArmAngle() == 0);
		assert(rbt.rightArmAngle() == 0);
	}
	@Test
	public void overExtend() {
		fail("Arm is over extended!");
	}

}
