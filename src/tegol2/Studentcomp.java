package tegol2;

import java.util.Comparator;

public class Studentcomp implements Comparator<Student> {
   private int flage;
	
   public Studentcomp(int p) {
	   this.flage=p;
   }
	
	@Override
	public int compare(Student o1, Student o2) {
		int a1,a2;
		double b1,b2;
		String n1,n2;
		
		if(flage==0) {
		a1=o1.getAge();
		a2=o2.getAge();
		if(a1>a2) {
			return 1;
		}
		if(a1<a2) {
			return -1;
		}
		if(a1==a2) {
			return 0;
		}	
		}
		
		if(flage==1) {
			b1=o1.getAverage();
			b2=o2.getAverage();
			if(b1>b2) {
				return 1;
			}
			if(b1<b2) {
				return -1;
			}
			if(b1==b2) {
				return 0;
			}
		}
		
		if(flage==2) {
		n1=o1.getName();
		n2=o2.getName();
		if(n1.compareTo(n2)>0) {
			return 1;
		}
		if(n1.compareTo(n2)<0) {
			return -1;
		}
		if(n1.compareTo(n2)==0) {
			return 0;
		}
			
		}
		
		return 0;
		
	}
	

}
