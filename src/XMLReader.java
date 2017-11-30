import javax.xml.parsers.*;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import java.io.*;

/**
 * XMLReader gets your xml document and creates a tree based on the data that
 * the document holds.
 * 
 * @author Megan Ferrara
 * @version 5/2/17
 *
 */
public class XMLReader {
	Document document;

	// ----------------START OF METHODS---------------------//

	/**
	 * XMLReader gets the document that you will be using to create a tree.
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public XMLReader() throws SAXException, IOException,
			ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File xmlFile = new File("questionAnswersFile.xml");// name of what you want
														// your doc to be
		document = builder.parse(xmlFile);
	}

	/**
	 * CreatingTree creates a tree from the data collected from your XML file
	 * 
	 * @param elt
	 *            the current element being added to your tree
	 * @return node returns your data
	 */
	public DefaultBinaryTreeNode<String> creatingTree(Element elt) {

		if (!elt.hasChildNodes()) {
			DefaultBinaryTreeNode<String> node = new DefaultBinaryTreeNode<String>();
			node.setData(elt.getAttribute("data"));
			return node;

		} else {
			NodeList children = elt.getChildNodes();
			Element[] nodes = new Element[2];
			int nodesCounter = 0;

			for (int i = 0; i < children.getLength(); i++) {
				if (children.item(i).getNodeName().equals("node")) {
					nodes[nodesCounter] = (Element) children.item(i);
					nodesCounter++;
				}
			}

			DefaultBinaryTreeNode<String> node = new DefaultBinaryTreeNode<String>();
			node.setData(elt.getAttribute("data"));
			node.setLeftChild(creatingTree(nodes[0]));
			node.setRightChild(creatingTree(nodes[1]));
			return node;
		}

	}

	/**
	 * GetTree gets your binary tree
	 * 
	 * @return binaryTree
	 */
	public DefaultBinaryTree<String> getTree() {
		DefaultBinaryTreeNode<String> rootNode = creatingTree(document
				.getDocumentElement());
		DefaultBinaryTree<String> binaryTree = new DefaultBinaryTree<>();
		binaryTree.setRoot(rootNode);
		return binaryTree;
	}

}
