import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Typing
{
	public static void main(String args[]) throws Exception
	{
		Runtime.getRuntime().exec("notepad.exe");

		Thread.sleep(2000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_O);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_COMMA);
		Thread.sleep(50);

		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(50);

		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_K);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_O);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(50);

		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_R);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(50);

		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_Y);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_O);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_U);
		Thread.sleep(50);

		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_R);
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_E);


	}
}