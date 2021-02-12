package tegol2;

public class MyLinkedList {
		private Node head;
		private int size;
		public MyLinkedList(){
		head = null;
		size = 0;
		}
		public void invert() {
			Node t=this.head;
			while(t.getNext()!=null) {
			Node f=this.head;
				t=t.getNext();
			}
			
			Node hea=t;
			Node f1=this.head;
			while(f1!=null) {
				if(f1.getNext()==t) {
					t.setNext(f1);
					t=f1;
					f1=this.head;
				}
				
			}
			this.head=hea;
		
		}
		
		
		public void r() {
		Node h =this.head;
		Node tail=null;
		while(h.getNext()!=null) {
			tail=h;
			h=h.getNext();
		}
		tail.setNext(null);
		h.setNext(this.head);
			
		}
		
		
		
		
		public String toString(){
		String ans = "[";
		if (head == null) ans = "[]";
		else {
		Node n = head;
		while(n.getNext() != null){
		ans = ans + n + ", ";
		n = n.getNext();
		}
		ans = ans + n +"]";
		}
		return ans;
		}
		

}
