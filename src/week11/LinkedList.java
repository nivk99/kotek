package week11;
public class LinkedList {
	private Node first;
	private Node clean;
	private int size;

	public LinkedList() {
		first = null;
		size = 0;
	}
	public void Add(int data) {		
		Node curr = new Node(data);
		curr.setNext(first);
		first = curr;
		size++;
	}

	public Node getFirst() {
		return first;
	}

	public int getSize() {
		return size;
	}
	public Node cleen(int data) {	
		while(first.getData()!=data) {
		first=first.getNext();
		}
		return first;
	}
	

}
