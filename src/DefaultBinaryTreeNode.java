/**
 * DefaultBinaryTreeNode holds functions used to create your binary tree and
 * implements the BinaryTreeNode<T>
 * 
 * @author Megan Ferrara
 * @version 4/24/17
 *
 * @param <T>
 */

public class DefaultBinaryTreeNode<T> implements BinaryTreeNode<T> {
	public T data;
	BinaryTreeNode<T> leftChild;
	BinaryTreeNode<T> rightChild;

	// ----------------START OF METHODS--------------------//

	/**
	 * GetData gets the data
	 * 
	 * @return data
	 */
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}

	/**
	 * SetData sets data
	 * 
	 * @param data
	 *            gets the data you want to set
	 */
	public void setData(T data) {
		// TODO Auto-generated method stub
		this.data = data;

	}

	/**
	 * GetLeftChild gets the left child in your binary tree
	 * 
	 * @return leftChild
	 */
	public BinaryTreeNode<T> getLeftChild() {
		// TODO Auto-generated method stub
		return leftChild;
	}

	/**
	 * GetRightChild gets the right child in your binary tree
	 * 
	 * @return rightChild
	 */
	public BinaryTreeNode<T> getRightChild() {
		// TODO Auto-generated method stub
		return rightChild;
	}

	/**
	 * SetLeftChild sets the left child
	 * 
	 * @param left
	 *            gets the left child
	 */
	public void setLeftChild(BinaryTreeNode<T> left) {
		// TODO Auto-generated method stub
		// Check to see if your left child is empty
		//if (getLeftChild() == null) {
			this.leftChild = left;
		//}

	}

	/**
	 * SetRightChild sets the right child
	 * 
	 * @param right
	 *            gets the right child
	 */
	@Override
	public void setRightChild(BinaryTreeNode<T> right) {
		// TODO Auto-generated method stub
		// Check to see if your right child is empty
		//if (getRightChild() == null) {
			this.rightChild = right;
		//}

	}

	/**
	 * IsLeaf checks to see if there are no left or right children making it a
	 * leaf
	 * 
	 * @return true if it is a leaf
	 * @return false if there are left or right children
	 */
	public boolean isLeaf() {
		// TODO Auto-generated method stub

		if (getLeftChild() == null && getRightChild() == null) {
			return true;
		}
		return false;
	}

}
