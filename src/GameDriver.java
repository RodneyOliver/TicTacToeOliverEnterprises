import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.SplashScreen;
import java.awt.*;

public class GameDriver 
{

	public static void main(String[] args) 
	{		
	    
        final SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }
        Graphics2D g = splash.createGraphics();
        if (g == null) {
            System.out.println("g is null");
            return;
        }

		
		
		/*
		JFrame mainGameFrame = new JFrame("TIC TAC TOE");
		//JFrame.setDefaultLookAndFeelDecorated(true);
		mainGameFrame.setResizable(true);
		mainGameFrame.setSize(1400,800);
		mainGameFrame.setVisible(true);
		mainGameFrame.setLocationRelativeTo(null);
		mainGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		*/
	}


}


