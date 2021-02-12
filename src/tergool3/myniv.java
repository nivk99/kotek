package tergool3;

public class myniv<T> implements MyListInterface<T> {
	private Link<T> head;

	public myniv(Link<T> head) {
		this.head = head;
	}

	public myniv() {
		this.head = null;
	}
	
	
	public Link<T> gethed() {
		return this.head ;
	}
	public void sethead(Link<T>m) {
		this.head=m;
	}
	

	@Override
	public void add(T a) {
		if (this.size() == 0) {
			this.head = new Link<T>(a, this.head);
		} else {
			Link<T> t = mylist(this.size() - 1);
			t.setNext(new Link<T>(a, null));
		}

	}

	private Link<T> mylist(int a) {
		if (this.size() == 0) {
			return this.head;
		} else {
			Link<T> t = this.head;
			for (int i = 0; i < a; i++) {
				t = t.getNext();
			}

			return t;
		}
	}

	@Override
	public void addAt(T a, int i) {
		if ((i < 0) || (this.size() < i)) {
			System.err.print("this is not !!!!");
		} else {
			if(i==0) {
			Link<T> h=new Link<T>(a, this.head);
			this.head=h;
			}
			else {
			Link<T> t = mylist(i - 1);
			Link<T> newa = new Link<T>(a, t.getNext());
			t.setNext(newa);
			}
		}

	}

	@Override
	public void removeElementAt(int i) {
		if(i==0) {
			this.head=this.head.getNext();
		}
		
		else {
		Link<T>m=mylist(i-1);
		m.setNext(m.getNext().getNext());
		}
	}

	@Override
	public boolean contains(T a) {
		boolean ans =false;
		for(int i=0;i<this.size();i++) {
			if(mylist(i).equals(a)) {
				ans=true;
						break;
			}
		}
		
		
		
		
		return ans;
	}

	@Override
	public T get(int i) {
	Link<T> t = mylist(i);
		return t.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size()==0;
	}

	@Override
	public int size() {
		if (this.head == null) {
			return 0;
		}
		int size = 1;
		Link<T> t = this.head;
		while (t.getNext() != null) {
			t = t.getNext();
			size++;
		}

		return size;
	}

	public void connect(myniv<T> l) {
	if(this.head==null) {
		this.head=l.gethed();
	}
	Link<T> m =mylist(this.size()-1);
	m.setNext(l.gethed());
	
	}
	
	public void raversone() {
		Link<T> h=this.head;
		Link<T> tail=null;
			while(h.getNext()!=null) {
				tail=h;
				h=h.getNext();
			}
			tail.setNext(null);
			h.setNext(head);
			this.sethead(h);
			
	}
	
	
	public void bbal() {
		if(this.size()==0||this.head==null) {
			return;
		}
		else {
			int i=0;
			Link<T> tamp=this.head;
			for(int j=0;j<this.size()-1;j++) {
			  i=0;
			 tamp=this.head;
			while(tamp.getNext()!=null) {
				if(helpbbal(tamp,tamp.getNext())) {
					swop(i,i+1);
					i++;
					continue;
				}
				i++;
				tamp=tamp.getNext();
			}
		}
			return;
		}
	}
	private boolean helpbbal(Link<T> one,Link<T> two) {
		String a=(String)(one.getData());
		String b=(String)(two.getData());
		if(b.charAt(0)-a.charAt(0)<0) {
			return true;
		}
		else {
		return false;
		}
		
	}
	
	public void swop(int i,int j) {
		if(i==j||i<0||j<0||this.size()<j||this.size()<i) {
			return;
		}
		if(i>j) {
			int h=j;
			j=i;
			i=h;		
		}
		Link<T> taili=null,curri =this.head;
		Link<T> tailj=null,currj =this.head;
		for(int a=0;a<i;a++) {
			taili=curri;
			curri=curri.getNext();
		}
		for(int a1=0;a1<j;a1++) {
			tailj=currj;
			currj=currj.getNext();
		}
		
		
		if(taili!=null)
			taili.setNext(currj);
		else
			this.head=currj;
		tailj.setNext(curri);
		Link<T> tamp=curri.getNext();
		curri.setNext(currj.getNext());
		currj.setNext(tamp);
		
	
	}
	
	
	
	public void ravers() {
		Link<T> m=recorsravers(null,this.head,this.head.getNext());
		this.sethead(m);
		
	}
	
	
	private Link<T> recorsravers(Link<T> tail, Link<T> head2, Link<T> next) {
		if(head2==null) {
			return tail;
			
		}
		head2.setNext(tail);
		if(next!=null) {
			return recorsravers(head2,next,next.getNext());
		}
		else {
		
		return recorsravers(head2,next,null) ;
		}
	}

	public String toString() {
		String ans = "Linkniv: ";
		for (int i = 0; i < size(); i = i + 1) {
			ans += get(i) + ",";
		}
		return ans;
	}

	@Override
	public void connect(Object l) {
		// TODO Auto-generated method stub
		
	}

}
