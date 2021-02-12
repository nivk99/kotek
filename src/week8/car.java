package week8;

public class car {
	private String x;
	private String y;
	
	public car() {
		x="Hello";
		y="my neam is";
	}
		
	public car(String x,String y) {
		this.x=x;
		this.y=y;
			
		}
	public car(car z) {
		this.x= z.x;
		this.y= z.y;
	}
	
	
	public void setY(String y) {
		this.y = y;
	}

	public String getx() {
		return x;
	}
	public String gety() {
		return y;
	}
	public void setX(String x) {
		this.x= x;
	}
	
	
			
				
	}
	
	


