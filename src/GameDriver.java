import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class GameDriver 
{
	
	
	public static void main(String[] args) 
	{
		JFrame mainGameFrame = new JFrame("TIC TAC TOE");
		//JFrame.setDefaultLookAndFeelDecorated(true);
		
		mainGameFrame.setResizable(true);
		mainGameFrame.setSize(1400,800);
		mainGameFrame.setVisible(true);

		mainGameFrame.setLocationRelativeTo(null);
		mainGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}


