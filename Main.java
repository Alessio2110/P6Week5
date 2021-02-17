package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application
//A new comment to test "commit"
//Another commit
public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1", 50, 50); // Create first controller
		Controller2 c2 = new Controller2(model, "Controller 2", 50, 200); // Create second controller
		Controller2 c3 = new Controller2(model, "Controller 3", 50, 350); // Create third controller
		Controller2 c4 = new Controller2(model, "Controller 4", 50, 500); // Create forth controller
		Controller2 c5 = new Controller2(model, "Controller 5", 50, 650); // Create fifth controller
    } // main
  
} // Main
