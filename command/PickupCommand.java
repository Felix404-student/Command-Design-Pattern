package csce247.command;
/**
 * Creates a PickupCommand object that implements the Command interface 
 * @author Justin Brown
 */

public class PickupCommand implements Command {
	private Robot robot; 
	
	/**
	 * Constructor that creates a specific PickupCommand by assigning a robot to that command based on robot parameter 
	 * @param robot A robot
	 */
	public PickupCommand(Robot robot) {
		this.robot = robot; 
	}
	
	/**
	 * Calls the pickup function on the robot 
	 */
	public void execute() {
		robot.pickup(); 
	}
}
