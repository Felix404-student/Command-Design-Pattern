package csce247.command;
/**
 * Creates a HealCommand object that implements the Command interface 
 * @author Justin Brown
 */
public class HealCommand implements Command {
	private Robot robot; 
	
	/**
	 * Constructor that creates a specific HealCommand by assigning a robot to that command based on robot parameter 
	 * @param robot A robot
	 */
	public HealCommand(Robot robot) {
		this.robot = robot; 
	}
	
	/**
	 * Calls the heal function on the robot 
	 */
	public void execute() {
		robot.heal(); 
	}
}
