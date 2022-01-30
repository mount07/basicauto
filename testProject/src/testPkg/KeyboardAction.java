package testPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardAction {

	public static void main(String[] args) throws AWTException, InterruptedException {

		
		while(true) {
			
			Thread.sleep(100000);
			
			Robot robot = new Robot();
			  
	        robot.delay(300);
	        
	        System.out.println("Starting....");
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(2000);
//	        robot.keyPress(KeyEvent.VK_ENTER);
	        
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_TAB);
//	        robot.keyRelease(KeyEvent.VK_ENTER);
		}

	}
}
