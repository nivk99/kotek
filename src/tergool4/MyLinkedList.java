package tergool4;

public class MyLinkedList {

	private nodestring head;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void add(String data) {
		nodestring tamp = this.head;
		if (this.head == null || this.size == 0) {
			this.head = new nodestring(data);
			size++;
		} else {
			tamp = mylink(this.size() - 1);
			tamp.setNext(new nodestring(data));
			size++;
		}

	}
	
	
	public void addAt(String data,int i) {
		if(i<0||i>this.size) {
			return;
		}
		if(i==0) {
			nodestring n=new nodestring(data);
			n.setNext(this.head);
			this.head=n;
			size++;
			return;
		}
		else {
		nodestring tamp1=mylink(i-1);
		nodestring tamp2 =tamp1.getNext();
		tamp1.setNext(new nodestring(data));
		tamp1.getNext().setNext(tamp2);
		size++;
		return;
		
		}
		
		
	}

	private nodestring mylink(int a) {
		nodestring tamp = this.head;
		if (a < 0 || a > this.size || this.head == null || a == 0) {
			return tamp;
		} else {
			for (int i = 0; i < a; i++) {
				tamp = tamp.getNext();
			}

			return tamp;
		}

	}

	public int size() {
		nodestring tamp = this.head;
		int size = 0;
		while (tamp != null) {
			size++;
			tamp = tamp.getNext();
		}
		return size;

	}

	public int num(String q) {
		int num = 0;
		if (this.head == null) {
			return 0;
		} else {
			for (int i = 0; i < this.size(); i++) {
				if (q.equals(mylink(i).getData())) {
					num++;
				}
			}
			return num;
		}

	}

	public void swop(int i, int j) {
		if (i < 0 || j < 0 || j > this.size || i > this.size) {
			return;
		}
		if (i > j) {
			int n = j;
			j = i;
			i = n;
		}
		nodestring taili = null, headi = this.head;
		for (int ai = 0; ai < i; ai++) {
			taili = headi;
			headi = headi.getNext();
		}
		nodestring tailj = null, headj = this.head;
		for (int aj = 0; aj < j; aj++) {
			tailj = headj;
			headj = headj.getNext();
		}
		if (taili != null)
			taili.setNext(headj);
		else
			this.head = headj;

		tailj.setNext(headi);
		nodestring tamp = headi.getNext();
		headi.setNext(headj.getNext());
		headj.setNext(tamp);
	}

	public void dalit(int i) {
		if (i < 0 || i > this.size) {
			return;
		}
		if (i == 0) {
			this.head = this.head.getNext();
			size--;
			return;
		} else {
			nodestring tamp = mylink(i - 1);
			tamp.setNext(tamp.getNext().getNext());
			size--;
			return;
		}

	}
	
	

	public void revers() {
		if (this.head == null)
			return;
		nodestring newhead = reversrecrs(null, this.head, this.head.getNext());
		this.head = newhead;

	}

	private nodestring reversrecrs(nodestring tail, nodestring head1, nodestring next) {
		if (head1 == null)
			return tail;
		head1.setNext(tail);
		if (next == null)
			return reversrecrs(head1, next, null);
		return reversrecrs(head1, next, next.getNext());
	}

	public String toString() {
		String tostr = "";
		if (this.head == null) {
			return tostr;
		} else
			for (int i = 0; i < this.size(); i++) {
				tostr = tostr +">"+ mylink(i).getData();
			}
	
		return tostr.substring(1);
	}

}
