package targol;

public class NodeD {
		private Object data;
		private NodeD next, prev;
		public NodeD(NodeD prev, NodeD next, Object data){
		this.data = data;
		this.prev = prev;
		this.next = next;
		}
		public NodeD( NodeD next, Object data){
			this.data = data;
			this.next = next;
		}
			
		public String toString(){return data.toString();}
		public NodeD getNext() {return next;}
		public NodeD getPrev() {return prev;}
		public Object getData() {return data;}
		public void setNext(NodeD n) {next = n;}
		public void setPrev(NodeD p) {prev = p;}
		}





