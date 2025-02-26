package java_0219.ch05.first;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0 ; i < 10 ; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}
		}
		});
		
		thread.start();
 }
}
