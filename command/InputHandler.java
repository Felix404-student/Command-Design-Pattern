package csce247.command;
import java.util.HashMap;
/**
 * This class holds a hashmap for the commands, and their input keys
 * @author Justin Brown
 */

public class InputHandler {
	private HashMap<String, Command> commands = new HashMap<String, Command>();

	/**
	 * The hashmap is initialized in this constructor
	 * @param robot A robot 
	 */
	public InputHandler(Robot robot) {
		PickupCommand pickup = new PickupCommand(robot); 
		JumpCommand jump = new JumpCommand(robot); 
		FireCommand fire = new FireCommand(robot);
		HealCommand heal = new HealCommand(robot); 
		commands.put("pickup", pickup); 
		commands.put("jump", jump); 
		commands.put("fire", fire); 
		commands.put("heal", heal);
	}
	
	/**
	 * This function calls the appropriate command that's key matches the data parameter.
	 * @param data A string input 
	 */
	public void inputEntered(String data) {
		Command command = commands.get(data); 
		command.execute(); 
	}
}
