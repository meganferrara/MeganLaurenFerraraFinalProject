import java.io.IOException;


import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
/**
 * RestrictedGameViewApplication displays the restricted 20 questions game.
 * @author Megan Ferrara
 * @version 5/2/17
 *
 */
public class RestrictedGameViewApplication {
	
	/**
	 * Main sets the frame that the game will be displayed on
	 * 
	 * @param args not used
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
		
		JFrame gameFrame = new JFrame("WHICH THAT 70s SHOW CHARACTER ARE YOU!");
		
		gameFrame.setSize(600, 420);
		
		gameFrame.add(new GameViewQuiz());
		
		gameFrame.setDefaultCloseOperation(3);
		
		gameFrame.setVisible(true);
	}

}
