//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * JUnitTester tests some of the methods for your binary tree
// * 
// * @author Megan Ferrara
// * @version 4/24/17
// *
// */
//
//public class JUnitTester {
//
//	public static final int NUM_ELEMENTS = 5;
//	private Integer[] randomArray;
//	private BinarySearchTree<Integer> randomBST;
//
//	// ----------------START OF METHODS--------------//
//	/**
//	 * SetUp sets up the RandomArray
//	 * 
//	 * @throws Exception
//	 */
//	@Before
//	public void setUp() throws Exception {
//		setupRandomArray();
//	}
//
//	/**
//	 * SetupRandomArray sets up the random array you will be using in your tests
//	 */
//	private void setupRandomArray() {
//		randomArray = new Integer[NUM_ELEMENTS]; // random integers
//		for (int i = 0; i < randomArray.length; i++)
//			randomArray[i] = new Integer((int) (Math.random() * 10000) + 1);
//
//		randomBST = new DefaultBinarySearchTree<Integer>();
//		for (int i = 0; i < randomArray.length; i++)
//			randomBST.insert(randomArray[i]);
//
//		System.out.println("random inorder traversal is: "
//				+ randomBST.toString());
//	}
//
//	/**
//	 * TestTraversal tests your inorder traversal
//	 */
//	@Test
//	public void testTraversal() {
//		LinkedList<Integer> inorderTraversal = randomBST.inorderTraversal();
//
//		// check that it's in order
//		assertEquals("random BST in order", true, isOrdered(inorderTraversal));
//	}
//
//	/**
//	 * IsOrdered checks to see if your list is in order
//	 * 
//	 * @param list
//	 *            gets your linked list
//	 * @return true if it was ordered
//	 */
//	private boolean isOrdered(LinkedList<Integer> list) {
//		LinkedListNode<Integer> current = list.getFirstNode();
//		if (current.getNext() == null) {
//			// list has size 1, so it's ordered
//			return true;
//		} else {
//			// list has size > 1
//			LinkedListNode<Integer> currentNext = current.getNext();
//
//			while (current.getNext() != null) {
//				// compare the two
//				if (current.getData().compareTo(currentNext.getData()) > 0)
//					return false;
//				// otherwise, update
//				current = current.getNext();
//				currentNext = currentNext.getNext();
//			}
//
//			// if we get here, it was ordered
//			return true;
//
//		}
//	}
//
//	/**
//	 * TestEltExists tests to see if your element exists
//	 */
//	@Test
//	public void testEltExists() {
//		int randomIdx = (int) Math.floor(Math.random() * randomArray.length);
//		assertEquals("search for element in random tree",
//				randomArray[randomIdx], randomBST
//						.search(randomArray[randomIdx]).getData());
//	}
//
//	/**
//	 * TestEltNotExist tests to see if your element does not exist
//	 */
//	@Test
//	public void testEltNotExist() {
//		assertEquals("search for element not in random tree", null,
//				randomBST.search(new Integer(0)));
//	}
//
//	/**
//	 * TestMin tests if your find minElement method works
//	 */
//	@Test
//	public void testMin() {
//		System.out.println("Min in random tree is: " + randomBST.minElement());
//		assertEquals("Testing min in random tree", findMin(randomArray),
//				randomBST.minElement());
//	}
//
//	/**
//	 * TestMax tests if your find maxElement method works
//	 */
//	@Test
//	public void testMax() {
//		System.out.println("Max in random tree is: " + randomBST.maxElement());
//		assertEquals("Testing max in random tree", findMax(randomArray),
//				randomBST.maxElement());
//	}
//
//	/**
//	 * FindMin finds your smallest integer
//	 * 
//	 * @param a
//	 *            is your integer
//	 * @return min
//	 */
//	private Integer findMin(Integer[] a) {
//		// start min at first element
//		Integer min = a[0];
//
//		// look through the rest of the array
//		for (int i = 1; i < a.length; i++)
//			// if found something smaller
//			if (a[i].compareTo(min) < 0)
//				// save it
//				min = a[i];
//
//		// return result
//		return min;
//	}
//
//	/**
//	 * FindMax finds your biggest integer
//	 * 
//	 * @param a
//	 *            is your integer
//	 * @return max
//	 */
//	private Integer findMax(Integer[] a) {
//		// start max at first element
//		Integer max = a[0];
//
//		// look through the rest of the array
//		for (int i = 1; i < a.length; i++)
//			// if found something smaller
//			if (a[i].compareTo(max) > 0)
//				// save it
//				max = a[i];
//
//		// return result
//		return max;
//	}
//}
