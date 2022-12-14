package com.crm.Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Java_Utility {
	/**
	 * This method is to avoid duplicate value
	 * @return
	 * @author Prakash
	 */
	 
	public int getRandomNum()
	{
		Random ran = new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
	}
	/**
	 * to perform keyboard actions-RobotClass
	 */
	
	public void hitTheButton() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void copyTheText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public void pasteTheText() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
