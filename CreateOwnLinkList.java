import java.util.Scanner;

public class CreateOwnLinkList {

	/**
	 * @author PRADEEP KUMAR
	 *
	 */
	public Node head = null;
	static int count = 0;

	class Node {
		private Node next;
		private Object data;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}

	}// node class end

	
	public void add(Object value) {
		count++;
		
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		Node current = head;
		Node temp = new Node(value);

		if (current != null) {
			while (current.getNext() != null) {
				current = current.getNext();
			}//while close
			current.setNext(temp);
		}
	}

	private int size() {
		return count;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String value = null;

		CreateOwnLinkList col = new CreateOwnLinkList();

		while (!"exit".equals(value)) {
			System.out.println("Please enter data; please enter exit for stop!");
			value = sc.next();
			if(!value.equals("exit")){
			col.add(value);
			}
		} //
		System.out.println(col.head + " with size " + col.size());

		System.out.println("Data=======================");
		
		while (null != col.head){
			System.out.println(col.head.data);
			col.head=col.head.getNext();
		} 
	}

}
