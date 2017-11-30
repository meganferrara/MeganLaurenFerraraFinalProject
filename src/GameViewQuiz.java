import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


public class GameViewQuiz extends JPanel implements ActionListener {
	XMLReader xmlReader;
	JButton btnStartQuiz;
	JButton btnResetQuiz;
	
	BinaryTree<String> tree;
	BinaryTreeNode<String> currentNode;
	
	/**
	 * Create the panel.
	 */
	public GameViewQuiz() throws SAXException, IOException, ParserConfigurationException{
		
		xmlReader = new XMLReader();
		tree = xmlReader.getTree();
		currentNode = tree.getRoot();
		startingScreenGUI();
	

	}
	
	public void startingScreenGUI() {
		ImageIcon questionMarksGif = new ImageIcon("Images/questionMarksGIF.gif");
		JLabel questionMarksGifLabel = new JLabel(questionMarksGif);
		questionMarksGifLabel.setBounds(6, 274, 138, 140);
		this.add(questionMarksGifLabel);
		
		
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel whatCharacterAreYouTitle = DefaultComponentFactory.getInstance().createTitle("Which That 70s Show Character are you?");
		whatCharacterAreYouTitle.setBounds(94, 6, 405, 27);
		whatCharacterAreYouTitle.setFont(new Font("Weibei TC", Font.BOLD, 20));
		whatCharacterAreYouTitle.setHorizontalAlignment(SwingConstants.CENTER);
		whatCharacterAreYouTitle.setVerticalAlignment(SwingConstants.TOP);
		add(whatCharacterAreYouTitle);
		
		//Picture of Group of Characters
		ImageIcon characterGroupPicture = new ImageIcon("Images/that70sShowGroupImage.jpg");
		JLabel characterGroupPictureLabel = new JLabel(characterGroupPicture);
		characterGroupPictureLabel.setBounds(94, 30, 411, 239);
		characterGroupPictureLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		add(characterGroupPictureLabel);
		

		
		JLabel clickHereToFindOutLabel = new JLabel("Click Here to Find Out!");
		clickHereToFindOutLabel.setFont(new Font("Weibei TC", Font.PLAIN, 26));
		clickHereToFindOutLabel.setBounds(150, 281, 333, 37);
		add(clickHereToFindOutLabel);
		
		btnStartQuiz = new JButton("START QUIZ");
		btnStartQuiz.addActionListener(this);
		btnStartQuiz.setForeground(new Color(255, 99, 71));
		btnStartQuiz.setFont(new Font("Weibei TC", Font.PLAIN, 17));
		btnStartQuiz.setBounds(231, 329, 147, 51);
		add(btnStartQuiz);
		
		
		
		
		btnStartQuiz.addActionListener(this);
		
		this.validate();
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnResetQuiz)) {
			this.removeAll();
			//initialGUI();
			currentNode = tree.getRoot();
			revalidate();
			repaint();
		}
		else if(e.getSource().equals(btnStartQuiz)) {
			this.removeAll();
			//initialGUI();
			revalidate();
			repaint();
		}
		
	}
}
