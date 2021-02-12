package tergool4;

public class nodestring {
	private nodestring next;
	private String data;
	
	public nodestring(nodestring next, String data) {
		this.next = next;
		this.data = data;
	}

	public nodestring(String data) {
		this(null,data);
	
	}

	public nodestring getNext() {
		return next;
	}

	public void setNext(nodestring next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	


	
	
	
	
	
	

}
