import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.SplashScreen;
import java.net.URL; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
//import java.awt.SplashScreen;
//import java.net.URL;
//import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameDriver 
{	
  public static void main(String args[]) throws Exception
  {
	  SplashScreen splash = SplashScreen.getSplashScreen();
	  //splash.setImageURL(new URL("/imageAssets/splash.gif"));
	  System.out.println(splash.getImageURL());
	  
	  
	    Graphics2D g = (Graphics2D) splash.createGraphics();
	    Dimension dim = splash.getSize();
	    for (int i = 0; i < 100; i++) {
	      g.setColor(Color.RED);
	      g.fillRect(50, 50, dim.width - 100, dim.height - 100);
	      splash.update();
	      try {
	        Thread.sleep(250);
	      } catch (InterruptedException ignored) {
	      }
	    }
	    JFrame frame = new JFrame("Splash Me2");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JLabel label = new JLabel("Hello, Splash", JLabel.CENTER);
	    frame.add(label, BorderLayout.CENTER);
	    frame.setSize(300, 95);
	    frame.setVisible(true);
  }
}
//---------------------------------------------------------------------------
/*
import java.awt.SplashScreen;
import java.net.URL;
public class Main {
  public static void main(String args[]) throws Exception{
    SplashScreen splash = SplashScreen.getSplashScreen();
    splash.setImageURL(new URL("http://yourURL"));
    System.out.println(splash.getImageURL());
  }
}
*/


// --------------------------------------------------------------------------		
//		final SplashScreen splash = SplashScreen.getSplashScreen();
//		if (splash == null) {
//			System.out.println("SplashScreen.getSplashScreen() returned null");
//			return;
//		}
//
//		Graphics2D g = splash.createGraphics();
//
//		if (g == null) {
//			System.out.println("g is null");
//			return;
//		}
// -------------------------------------------------------------------------
		/*
		 * JFrame mainGameFrame = new JFrame("TIC TAC TOE");
		 * //JFrame.setDefaultLookAndFeelDecorated(true);
		 * mainGameFrame.setResizable(true); mainGameFrame.setSize(1400,800);
		 * mainGameFrame.setVisible(true);
		 * mainGameFrame.setLocationRelativeTo(null);
		 * mainGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
		 * ;
		 */

