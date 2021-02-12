package bohan;

public class lin {
	private Node2 head;
	private int num;

	public lin() {
		head = null;
		num = 0;
	}

	public void AddLast(int data) {
		Node2 n = new Node2(data);
		n.setNext(head);
		head = n;
	}

	public int size(int data) {
		Node2 s = head;
		int d = 0;
		int size = 0;
		while (d != data) {
			size = size + 1;
			d = s.getData();
			s = s.getNext();
		}

		return size;

	}

	public void sit(int data) {
		Node2 lest = head;
		Node2 fist = head.getNext();
		if (lest.getData() == data) {
			this.head = this.head.getNext();
		}
		while (fist != null) {
			if (fist.getData() == data) {
				Node2 n = fist.getNext();
				lest.setNext(n);
				fist.setNext(null);
			}
			lest = lest.getNext();
			fist = fist.getNext();

		}

	}

	public Node2 cycle() {
		Node2 first = head.getNext();
		Node2 last = head;
		Node2 ne = new Node2(0);
		while (first != null) {
			Node2 n = last;
			last = last.getNext();
			n.setNext(ne);
			if (first.equals(ne)) {
				return first;
			}
			first = first.getNext();

		}

		return null;

	}

	public void ret() {
		ret(this.head);

	}

	private void ret(Node2 n) {
		if (n.getNext() == null) {
			this.head = n;
			return;
		}

		ret(n.getNext());
		n.getNext().setNext(n);
		n.setNext(null);

	}

	public void add1(int data) {
		if (this.head == null) {
			Node2 W = new Node2(data);
			W.setNext(head);
			head = W;
		} else {

			Node2 n = head;
			if (head.getNext() == null) {
				head.setNext(new Node2(data));
			} else {
				while (n.getNext() != null) {
					n = n.getNext();
				}

				n.setNext(new Node2(data));

			}

		}

	}

	public String toString() {
		String ans = "" + this.head.getData();
		Node2 n = this.head;
		while (n.getNext() != null) {
			n = n.getNext();
			ans = ans + " " + n.getData();

		}

		return ans;

	}

	public static void main(String[] args) {

		System.out.print(sphenic1(8));

	}

	public static boolean sphenic(int n) {

		for (int i = 2; i < n; i++) {
			if (i % 2 == 0 && i != 2) {
				i++;
			}

			if (n % i == 0) {
				int a = i;
				for (; i+1 < n; i++) {
					if (i % 2 == 0 ) {
						i++;
					}
					if (n % i == 0) {
						int b = i;
						for (; i+1 < n; i++) {
							if (i % 2 == 0 ) {
								i++;
							}
							if (a*b*i==n) {
								int c = i;
								return a * b * c == n;
							}
						}
					}

				}

			}

		}

		return false;

	}
	
	public static boolean sphenic1(int n ) {
		return sphenic11(n,2,3);
		
	}
	
	public static boolean sphenic2(int n ,int nn,int a) {
		
		for(int i=nn;i<n;i++) {
			if(i%2==0&&i!=2) {
				i++;
			}
			if(n%i==0) {
				return sphenic2(n/i,i,a-1);
			}
			
		}
	
			
		return n==1&&a==0;

	}
	public static boolean sphenic11(int n ,int nn,int a) {
		if(n==1) {
			return true;
		}
		if(nn%2==0&&nn!=2) {
			nn++;
		}
		if(n%nn==0&&a>=0) {
			int ans= n/nn; 
			if(ans%nn==0) {
				ans=ans/nn;
				a=a-1;
			}
			return sphenic11(ans,nn+1,a-1);
		}
		return false;
		
	}
	
	

}
