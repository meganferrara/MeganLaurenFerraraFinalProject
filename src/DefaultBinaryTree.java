/**
 * DefaultBinaryTree holds your manually created binary tree, the traversal
 * methods, and your get/set/isEmpty root methods.
 * 
 * @author Megan Ferrara
 * @version 4/24/17
 *
 * @param <T>
 */

public class DefaultBinaryTree<T> implements BinaryTree<T> {

	private static DefaultBinaryTree<String> binaryDwarfTree;
	private BinaryTreeNode<T> rootN = getRoot();

	// ----------------START OF METHODS--------------------//

	/**
	 * Main method manually creates your binary tree
	 * 
	 * @param args
	 *            gets arguments passed in (if any).
	 */
	public static void main(String[] args) {
		// Creating a tree corresponding to the Seven Dwarfs for each Dwarf.
		// Setting each dwarf either to the left of the right

		binaryDwarfTree = new DefaultBinaryTree<String>();

		// What we want the tree to look like
		// 					 Happy
		// 		   Doc 				   Sleepy
		// Bashful      Grumpy  			  Sneezy

		// -------HAPPY-------//
		DefaultBinaryTreeNode<String> happy = new DefaultBinaryTreeNode<String>();
		happy.setData("Happy");
		binaryDwarfTree.setRoot(happy);

		// -------DOC-------//
		DefaultBinaryTreeNode<String> doc = new DefaultBinaryTreeNode<String>();
		doc.setData("Doc");
		happy.setLeftChild(doc);

		// -------BASHFUL-------//
		DefaultBinaryTreeNode<String> bashful = new DefaultBinaryTreeNode<String>();
		bashful.setData("Bashful");
		doc.setLeftChild(bashful);

		// -------GRUMPY-------//
		DefaultBinaryTreeNode<String> grumpy = new DefaultBinaryTreeNode<String>();
		grumpy.setData("Grumpy");
		doc.setRightChild(grumpy);

		// -------SLEEPY-------//
		DefaultBinaryTreeNode<String> sleepy = new DefaultBinaryTreeNode<String>();
		sleepy.setData("Sleepy");
		happy.setRightChild(sleepy);

		// -------SNEEZY-------//
		DefaultBinaryTreeNode<String> sneezy = new DefaultBinaryTreeNode<String>();
		sneezy.setData("Sneezy");
		sleepy.setRightChild(sneezy);

	}

	/**
	 * GetRoot gets the root of the binary tree
	 * 
	 * @return rootN returns the root node
	 */
	public BinaryTreeNode<T> getRoot() {
		// TODO Auto-generated method stub
		// returns the root of the binary tree
		return rootN;
	}

	/**
	 * SetRoot sets the root
	 * 
	 * @param root
	 *            gets the root
	 */
	public void setRoot(BinaryTreeNode<T> root) {
		// TODO Auto-generated method stub
		// sets the root of a binary tree
		this.rootN = root;

	}

	/**
	 * isEmpty checks to see if the binary search tree is empty or not
	 * 
	 * @return isEmpty()
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		// checks to see if the binary search tree is empty or not
		return isEmpty();
	}

	// -----------------------TRAVERSALS-----------------------//

	// ---------INORDER TRAVERSAL---------//
	/**
	 * InorderTraversal calls the recursive inorderTraversal method which puts
	 * your binary tree in a inorder sequence.
	 * 
	 * @return inorderTraversalLinkedList
	 */
	public LinkedList<T> inorderTraversal() {
		// TODO Auto-generated method stub
		LinkedList<T> inorderTraversalLinkedList = new LinkedList<T>();
		inorderTraversal(rootN, inorderTraversalLinkedList);
		return inorderTraversalLinkedList;

	}

	/**
	 * InorderTraversal is a recursive method that puts your binary tree in a
	 * inorder sequence
	 * 
	 * @param node
	 *            gets the current node
	 * @param traversal
	 *            gets the traversal
	 */
	private void inorderTraversal(BinaryTreeNode<T> node,
			LinkedList<T> traversal) {
		// recursive method for inorderTraversal
		if (node != null) {
			inorderTraversal(node.getLeftChild(), traversal);
			traversal.insertLast(node.getData());
			inorderTraversal(node.getRightChild(), traversal);
		}

	}

	// ----------PREORDER TRAVERSAL----------//
	/**
	 * PreorderTraversal calls the recursive preorderTraversal method which puts
	 * your binary tree in a preorder sequence.
	 */
	public LinkedList<T> preorderTraversal() {
		// TODO Auto-generated method stub
		LinkedList<T> preorderTraversalLinkedList = new LinkedList<T>();
		preorderTraversal(rootN, preorderTraversalLinkedList);
		return preorderTraversalLinkedList;
	}

	/**
	 * PreorderTraversal is a recursive method that puts your binary tree in a
	 * preorder sequence
	 * 
	 * @param node
	 *            gets the current node
	 * @param traversal
	 *            get the traversal
	 */
	private void preorderTraversal(BinaryTreeNode<T> node,
			LinkedList<T> traversal) {
		// recursive method for preorderTraversal
		if (node != null)
			traversal.insertFirst(node.getData());
		preorderTraversal(node.getLeftChild(), traversal);
		preorderTraversal(node.getRightChild(), traversal);

	}

	// ----------POSTORDER TRAVERSAL----------//
	/**
	 * PostorderTraversal calls the recursive postorderTraversal method that
	 * puts your binary tree in a post order sequence.
	 * 
	 * @return postorderTraversalLinkedList
	 */
	public LinkedList<T> postorderTraversal() {
		// TODO Auto-generated method stub
		LinkedList<T> postorderTraversalLinkedList = new LinkedList<T>();
		postorderTraversal(rootN, postorderTraversalLinkedList);
		return postorderTraversalLinkedList;
	}

	/**
	 * PostorderTraversal is a recursive method that puts your binary tree in a
	 * postorder sequence
	 * 
	 * @param node
	 *            gets the current node
	 * @param traversal
	 *            gets the traversal
	 */
	private void postorderTraversal(BinaryTreeNode<T> node,
			LinkedList<T> traversal) {
		// recursive method for postOrderTraversal
		if (node != null) {
			postorderTraversal(node.getLeftChild(), traversal);
			postorderTraversal(node.getRightChild(), traversal);
			traversal.insertLast(node.getData());
		}
	}

}
