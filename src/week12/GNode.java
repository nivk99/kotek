package week12;


public class GNode<T> {
	private T data;
	private GNode<T> next;

	public GNode(T data, GNode next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GNode getNext() {
		return next;
	}

	public void setNext(GNode next) {
		this.next = next;
	}

	public String toString() {
		return "" + this.data;
	}
}
