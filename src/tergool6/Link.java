package tergool6;


public class Link {

	private String data;
	private Link next;

	public Link(String data) {
		this.data = data;
		next = null;
	}

	public Link(String data, Link next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return this.data;
	}

	public Link getNext() {
		return this.next;
	}

	public void setNext(Link n) {
		this.next = n;
	}

	public String toString() {
		return "" + data.toString();
	}
}
