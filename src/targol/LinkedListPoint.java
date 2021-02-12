package targol;

import java.util.ArrayList;

import week12.Node;

public class LinkedListPoint<T> implements Comparable <T>{
	private NodeD head;
	private T p;
	private static int size;
	
    public LinkedListPoint(NodeD next, T p) {
    	this.p=(T)p;
    	head=new NodeD(next,p) ;
    	size++;
    }
    
    public LinkedListPoint() {
    	this.p=null;
    	this.head=null;
    }
    
    
    
    public NodeD gethea() {
		return head;
    	
    }
    public void add(Point p ) {
    	if(this.head==null) {
    		this.p=(T)p;
    		NodeD n =new NodeD(null,p);
    		head=n;
    	}
    	else {
    		NodeD N=new NodeD(null,p);
    		NodeD h= this.head;
    		while(h.getNext()!=null) {
    			h=h.getNext();
    		}
    		h.setNext(N);
    	}
    	size++;
    }
    public int getsize() {
    	return this.size;
    }
    
    public void invert() {
    	NodeD t=this.head;
		while(t.getNext()!=null) {
			NodeD f=this.head;
			t=t.getNext();
		}
		
		NodeD hea=t;
		NodeD f1=this.head;
		while(f1!=null) {
			if(t.equals(this.head)) {
				break;
				}
			
			if(f1.getNext().hashCode()==t.hashCode()) {
				t.setNext(f1);
				t=f1;
				f1.setNext(null);
				f1=this.head;
				continue;
			}
			
			
			f1=f1.getNext();
			
		}
		this.head=hea;
	
	}
    
    
    
    
    
    
    
    
    public boolean contains(Point p) {
    	double x=p.x();
    	double y=p.y();
    	NodeD n =this.head;
    	Point pp=(Point)n.getData();
    	while(n!=null) {
    	pp=(Point)n.getData();
    	if(pp.x()==x&&pp.y()==y) {
        	return true;	
        }
    	n=n.getNext();
    	}
		return false;
    		
    }

	public  boolean c(NodeD hh) {
		NodeD j =head;
		while(j.getNext()!=null) {
			j=j.getNext();
		}
		j.setNext(head.getNext().getNext());
		return cycle(hh);	
	}
    
    
    
    
    
	public boolean cycle(NodeD p) {	
		ArrayList<Integer> h=new ArrayList<Integer>(); 
		NodeD j=p;	
		while(j!=null) {
			System.out.print(j.getData().toString());
		if(h.contains(j.hashCode()))
		{
			return true;
		}
		else {
			h.add(j.hashCode());
		}
		j=j.getNext();
			
		}
		
		return false;
		
	}
    
    
    
    
    
    
    
    
    
    
    public boolean containsrecors(Point p) {
    	NodeD d=this.head;
    	return recors(d,p.x(),p.y());
    	
    }
   private boolean recors(NodeD d,double x,double y) {
	   if(d==null) 
		   return false;
	   Point p=(Point)d.getData();
	   if(p.x()==x&&p.y()==y) { return true;}
	   
	   return recors(d.getNext(),x,y);
    	
    }
   
  
    
    
    public void remove(Point p) {
    	double x=p.x();
    	double y=p.y();
    	double xp,yp;
    	NodeD n =this.head;
    	Point pp=(Point)n.getData();
    	while(pp.x()==x&&pp.y()==y) {
    		if(n.getNext()==null) {
    			this.head=null;
    			size=0;
    			break;
    		}
			this.head=n.getNext();
			n.setNext(null);
			n =this.head;
			pp=(Point)n.getData();
			size--;
		}
    	
   
    	while(n.getNext()!=null) {
    		 pp=(Point)n.getNext().getData();
    		 xp=pp.x();
        	 yp=pp.y();
        	if(xp==x&&yp==y) {
        		size--;
        		if(n.getNext().getNext()==null) {
        			n.setNext(null);
        			break;
        		}
        		else {
        	NodeD N =n.getNext().getNext();
        	n.getNext().setNext(null);
        	n.setNext(N);
        		}
        		
        	}
        	
        	n=n.getNext();
        	
    			
    	}
    	
    }
    
    
    
    
	@Override
	public String toString() {
		NodeD h= this.head;
		String ans="";
		if(this.head==null) {
			return null;
		}
		while(h.getNext()!=null) {
			ans=ans+h.getData()+"!";
			h=h.getNext();	
		}
		return ans+h.getData();
	}
	@Override
	public int compareTo(T o) {
		
		return 0;
	}
	
	
	

	
	
	
	

}
