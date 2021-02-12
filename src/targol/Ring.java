package targol;

import targol.*;

public class Ring {
	
	private double r1;
	private double r2;
	private Point p;
	
	public Ring(Point m,double r1,double r2) {
		this.p=new Point(m);
		this.r1=r1;
		this.r2=r2;
		
	}
	public Ring (Ring p){
		this(p.p,p.r1,p.r2);
	}
	public  int inArea(Point a) {
	double d=p.distance(a);	
	if(d<r1) {
		return 1;
	}
	if(d>=r1&&d<=r2) {
		return 2;
	}
	else {
		return 3;
	}
	}
	

}
