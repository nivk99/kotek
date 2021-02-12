package tergool3;


public class Node_s {
	private int data;
	private Node_s next;

	public Node_s(int data,Node_s next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node_s getNext() {
		return next;
	}

	public void setNext(Node_s next) {
		this.next = next;
	}

	public String toString() {
		return "" + this.data;
	
		
	}
	
	
	
	
}
