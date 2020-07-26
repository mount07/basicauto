package testPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TestRobotKeys {

	private Robot robot;

    public static void main(String[] args) throws AWTException, InterruptedException {
//        new TestRobotKeys();
    	Robot robot = new Robot();
    	while(true) {
    	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    	Thread.sleep(1000);
    	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	Thread.sleep(2000);
    	}
    }

    public TestRobotKeys() {
        try {
            robot = new Robot();
            robot.setAutoDelay(250);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_ALT);
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
}
