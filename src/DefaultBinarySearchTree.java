/**
 * DefaultBinarySearchTree holds methods that insert/search data into your
 * binary tree and find minElements/maxElements in your binary tree.
 * 
 * @author Megan Ferrara
 * @version 4/24/17
 *
 * @param <T>
 */

public class DefaultBinarySearchTree<T extends Comparable<T>> extends
		DefaultBinaryTree<T> implements BinarySearchTree<T> {

	/**
	 * Insert calls your recursive insert method that inserts data into your
	 * tree.
	 * 
	 * @param data
	 *            gets your data
	 */
	public void insert(T data) {
		// TODO Auto-generated method stub
		// This is saying if the tree is not empty do this...
		if (getRoot() != null) {
			BinaryTreeNode<T> currentNode = getRoot();
			insert(data, currentNode);

		} else {
			setRoot(new DefaultBinaryTreeNode<T>());
			getRoot().setData(data);
		}

	}

	/**
	 * Insert is a recursive method that inserts data into your tree
	 * 
	 * @param data
	 *            gets data
	 * @param node
	 *            get current node
	 */
	private void insert(T data, BinaryTreeNode<T> node) {
		if (node != null) {
			BinaryTreeNode<T> currentTempNode = node;

			// If there is data in the current temp node
			if (currentTempNode != null) {
				// checks to see if the root has data on the left or right
				// inserts data accordingly
				if (data.compareTo(currentTempNode.getData()) < 0) {

					if (currentTempNode.getLeftChild() != null) {
						currentTempNode = currentTempNode.getLeftChild();
						insert(data, currentTempNode);

					} else {
						currentTempNode
								.setLeftChild(new DefaultBinaryTreeNode<T>());
						currentTempNode.getLeftChild().setData(data);
					}
					// If there is no data on the left then it checks to see if
					// there is
					// data on the right and inserts accordingly
				} else if (data.compareTo(currentTempNode.getData()) > 0
						|| data.compareTo(currentTempNode.getData()) == 0) {

					if (currentTempNode.getRightChild() != null) {
						currentTempNode = currentTempNode.getRightChild();
						insert(data, currentTempNode);

					} else {
						currentTempNode
								.setRightChild(new DefaultBinaryTreeNode<T>());
						currentTempNode.getRightChild().setData(data);
					}

				}
			}
		}
	}

	/**
	 * Search calls the recursive method used to search through your binary
	 * search tree
	 * 
	 * @param data
	 *            gets data
	 */
	@Override
	public BinaryTreeNode<T> search(T data) {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> getRoot = getRoot();
		return search(data, getRoot);
	}

	/**
	 * Search is a recursive method used to search through your binary tree
	 * 
	 * @param data
	 *            gets data
	 * @param node
	 *            gets your current node
	 * @return node
	 */
	private BinaryTreeNode<T> search(T data, BinaryTreeNode<T> node) {
		if (node != null) {
			// If there is data on the left return the data
			if (data.compareTo(node.getData()) < 0) {
				return search(data, node.getLeftChild());
			}
			// If there is no data on the left then checks to see
			// if there is data on the right and returns it
			else if (data.compareTo(node.getData()) > 0) {
				return search(data, node.getRightChild());
			}
		}
		// returns the data found
		return node;
	}

	/**
	 * MinElement returns your smallest element
	 * 
	 * @return currentNode.getData()
	 */
	@Override
	public T minElement() {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> currentNode = getRoot();
		if (currentNode.getLeftChild() != null) {
			// loops till the left most child is found
			while (currentNode.getLeftChild() != null) {
				currentNode = currentNode.getLeftChild();
			}
		}
		// returns the left most child data
		return currentNode.getData();
	}

	/**
	 * MaxElement returns your biggest element
	 * 
	 * @return currentNode.getData()
	 */
	@Override
	public T maxElement() {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> currentNode = getRoot();
		if (currentNode.getRightChild() != null) {
			// loops till the right most child is found
			while (currentNode.getRightChild() != null) {
				currentNode = currentNode.getRightChild();
			}
		}

		// returns the right most child data
		return currentNode.getData();
	}

}