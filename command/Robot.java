package csce247.command;
/**
 * This class creates a Robot object for which certain messages will display for each method that is called
 * @author Justin Brown
 */

public class Robot {
	public Robot(String name) {
		System.out.println("Welcome, my name is " + name + ". I'm a friendly robot");
	}
	
	/**
	 * function that displays pickup message when called 
	 */
	public void pickup() {
		System.out.println("Oh treasure, picking it up!");
	}
	
	/**
	 * function that displays jump message when called 
	 */
	public void jump() {
		System.out.println("Oh no a hazard, I'm jumping over it.");
	}
	
	/**
	 * function that displays fire message when called 
	 */
	public void fire() {
		System.out.println("Bad guys! Fire my blow torch at them.");
	}
	
	/**
	 * function that displays heal message when called 
	 */
	public void heal() {
		System.out.println("Thanks for healing my wounds.");
	}
}


