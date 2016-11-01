/**
 * 
 */

/**
 * @author mcolinj
 *
 */
public class RobotHand {
	boolean handOpen;
	
	public boolean isOpen() {
		return this.handOpen;
	}
	public boolean isClosed() {
		return !this.isOpen();
	}
	public void reset() {
		boolean closed = this.close();
	}
	/**
	 * Set the hand to open.
	 * @return false if hand was already open, otherwise, return true
	 */
	public boolean open() {
		boolean wasClosed = this.isClosed();
		
		this.handOpen = true;
		
		return (wasClosed);
	}
	
	/**
	 * Set the hand to closed.
	 * @return false if the hand was already closed, otherwise, return true
	 */
	public boolean close() {
		boolean wasOpen = this.isOpen();
		
		this.handOpen = false;
		
		return (wasOpen);
	}
	
	public String asString() {
		String state = this.handOpen ? "open" : "closed";
		return "Hand is "+state;
	}
}
