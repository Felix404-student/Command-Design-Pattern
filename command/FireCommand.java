package csce247.command;
/**
 * Creates a FireCommand object that implements the Command interface 
 * @author Justin Brown
 */

public class FireCommand implements Command {
	private Robot robot; 
	
	/**
	 * Constructor that creates a specific PFireCommand by assigning a robot to that command based on robot parameter 
	 * @param robot A robot
	 */
	public FireCommand(Robot robot) {
		this.robot = robot; 
	}
	
	/**
	 * Calls the fire function on the robot 
	 */
	public void execute() {
		robot.fire(); 
	}
}
