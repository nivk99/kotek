package targol;

public class LinkedListDouble {
		private NodeD head, tail;
		int size;
		public LinkedListDouble(){
		head = tail = null;
		size = 0;
		}
		public NodeD getHead() {return head;}
		public NodeD getTail() {return tail;}
		public void setHead(NodeD h) {head = h;}
		public void setTail(NodeD t) {tail = t;}
		public void add(Object item){
		if (head == null)
		head = tail = new NodeD(null, null, item);
		else{
		NodeD n = new NodeD(tail, null, item);
		tail.setNext(n);
		tail = n;
		}
		size++;
		}
		
		public String toString(){
		String s = "[";
		if (head != null){
		s = s + head.toString() + ", ";
		for (NodeD n=head.getNext();n!=null; n=n.getNext()){
		s = s + n.toString() + ", ";
		}
		s = s.substring(0, s.length()-2);
		}
		return s+"]";
		}
		
		
		
		
		public boolean contains(Object item){
		boolean ans = false;
		NodeD n = head;
		while (n != null && !n.getData().equals(item)){
		n = n.getNext();
		}
		if (n != null) ans = true;
		return ans;
		}
		public int size() {return size;}	
		public static void reverese(LinkedListDouble list) {
			NodeD l=list.getTail();
			NodeD r=list.getHead();
			r.setPrev(r.getNext());
			r.setNext(null);
			while(l.getPrev()!=null) {
				if(l.getNext()==null) {
			r=l;
			l.setNext(l.getPrev());
			l.setPrev(null);
			l=l.getNext();
				}
				else {
				NodeD m=l.getNext();	
				l.setNext(l.getPrev());
				l.setPrev(m);
				l=l.getNext();
					
				}
				
				
				
			}
			
			
			
			
		}
	
	
	

}
