package csce247.command;
/**
 * Creates a JumpCommand object that implements the Command interface 
 * @author Justin Brown
 */

public class JumpCommand implements Command {
	private Robot robot; 
	
	/**
	 * Constructor that creates a specific JumpCommand by assigning a robot to that command based on robot parameter 
	 * @param robot A robot
	 */
	public JumpCommand(Robot robot) {
		this.robot = robot; 
	}
	
	/**
	 * Calls the jump function on the robot 
	 */
	public void execute() {
		robot.jump(); 
	}
}

