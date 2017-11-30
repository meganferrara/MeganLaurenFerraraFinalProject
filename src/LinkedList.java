/**
 * LinkedList<T> creates method you can use to search your linked list
 * 
 * @author Megan Ferrara
 * @version 4/5/17
 *
 */

public class LinkedList<T> {

	private LinkedListNode<T> head;

	private LinkedListNode<T> tail;

	// ------------------START OF METHODS-------------------//

	/**
	 * LinkedList
	 */
	public LinkedList() {

	}

	/**
	 * GetFirst gets the first piece of data in your linked list
	 * 
	 * @return head.getData
	 */
	public T getFirst() {
		if (getFirstNode() == null) {
			return null;
		}
		return getFirstNode().getData();
	}

	/**
	 * GetFirstNode gets the first node in your linked list
	 * 
	 * @return head
	 */
	public LinkedListNode<T> getFirstNode() {
		return head;
	}

	/**
	 * GetLast gets the last piece of data in your linked list
	 * 
	 * @return node.getData
	 */
	public T getLast() {
		LinkedListNode<T> node = getLastNode();

		return node.getData();
	}

	/**
	 * GetLastNode gets last node in your linked list
	 * 
	 * @return currentNode
	 */
	public LinkedListNode<T> getLastNode() {
		if (head == null) {
			return null;
		}
		// current node is temporary
		LinkedListNode<T> currentNode = new LinkedListNode<>();

		currentNode = head;

		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}

		return currentNode;
	}

	/**
	 * InsertFirst inserts data to first
	 * 
	 * @param data
	 */
	public void insertFirst(T data) {
		LinkedListNode<T> node = new LinkedListNode<T>();
		node.setData(data);
		insertFirstNode(node);
	}

	/**
	 * InsertFirstNode inserts a first node
	 * 
	 * @param node
	 */
	public void insertFirstNode(LinkedListNode<T> node) {
		node.setNext(head);
		head = node;
	}

	/**
	 * InsertAfter inserts data after a certain node
	 * 
	 * @param currentNode
	 *            gets current node
	 * @param data
	 *            gets data
	 */
	public void insertAfter(LinkedListNode<T> currentNode, T data) {
		LinkedListNode<T> node = new LinkedListNode<T>();

		node.setData(data);
		node.setNext(currentNode.getNext());
		currentNode.setNext(node);
	}

	/**
	 * InsertLast inserts data last in your linked list
	 * 
	 * @param data
	 *            gets data
	 */
	public void insertLast(T data) {

		// new a LinkedListNode
		// set data for the new node

		LinkedListNode<T> newNode = new LinkedListNode<>();
		newNode.setData(data);

		LinkedListNode<T> currentNode = head;

		if (head == null) {

			head = newNode;

		} else {

			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}

			currentNode.setNext(newNode);

		}
	}

	/**
	 * DeleteFirst deletes first piece of data in a set
	 * 
	 */
	public void deleteFirst() {
		if (!isEmpty()) {
			head = head.getNext();

		}
		if (isEmpty()) {
			tail = null;
		}
		if ((!isEmpty()) && (head == null)) {
			tail = head;
		}
	}

	/**
	 * DeleteLast deletes last piece of data in a set
	 */
	public void deleteLast() {
		LinkedListNode<T> currentNode = new LinkedListNode<>();
		currentNode = head;
		while (currentNode.getNext().getNext() != null) {

			currentNode = currentNode.getNext();
		}

		currentNode.setNext(null);

	}

	/**
	 * DeleteNext deletes the next piece of data in a set
	 * 
	 * @param currentNode
	 *            gets the current node
	 */
	public void deleteNext(LinkedListNode<T> currentNode) {
		LinkedListNode<T> nextNextNode = currentNode.getNext().getNext();

		if (currentNode != tail) {
			if (currentNode.getNext() == tail) {
				tail = currentNode;
			}
			currentNode.setNext(nextNextNode);
		}

	}

	/**
	 * Size is the size of the linked list
	 * 
	 * @return numNode the number of nodes in your linked list
	 */
	public int size() {
		LinkedListNode<T> node = new LinkedListNode<T>();
		node = head;
		int numNode = 0;
		while (node.getNext() != null) {
			node = node.getNext();
			numNode++;
		}

		return numNode;
	}

	/**
	 * IsEmpty checks to see if the linked list is empty
	 * 
	 * @return true if there is a first node
	 */
	public boolean isEmpty() {
		// checks if there is a first node
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * ToString sets linked list to a string
	 * 
	 * @return listString
	 */
	public String toString() {
		LinkedListNode<T> node = new LinkedListNode<T>();
		String listString = new String("");
		node = head;

		while (node != null) {

			if (node.getNext() != null) {
				String nodeString = node.toString();
				listString = listString + nodeString;
				listString = listString + "->";
			} else if (node.getNext() == null) {
				String nodeString = node.toString();
				listString = listString + nodeString;
			}

			node = node.getNext();
		}

		return listString;
	}

}
