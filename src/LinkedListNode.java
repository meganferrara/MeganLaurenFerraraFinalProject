/**
 * LinkedListNode<T> holds your linked list methods
 * 
 * @author Megan Ferrara
 * @version 4/5/17
 *
 */

public class LinkedListNode<T> {

	private T data;
	private LinkedListNode<T> next;

	// ------------------START OF METHODS-------------------//

	/**
	 * LinkedListNode is your linked list of nodes
	 * 
	 * @param data
	 *            gets data
	 */
	public LinkedListNode(T data) {
		this.data = data;
		next = null;
	}

	/**
	 * LinkedListNode is your linked list
	 */
	public LinkedListNode() {
		data = null;
		next = null;
	}

	/**
	 * GetData gets the data
	 * 
	 * @return data
	 */
	public T getData() {
		return data;
	}

	/**
	 * SetData sets the data
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * GetNext gets the next node in your linked list
	 * 
	 * @return next
	 */
	public LinkedListNode<T> getNext() {
		return next;
	}

	/**
	 * SetNext sets a node to next in your linked list
	 * 
	 * @param node
	 */
	public void setNext(LinkedListNode<T> node) {

		next = node;
	}

	/**
	 * ToString sets your data to a string
	 * 
	 * @return data.toString
	 */
	public String toString() {
		if (data == null) {
			return "null";
		}
		return data.toString();
	}
}
