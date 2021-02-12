package week13;

import java.util.Date;

import week10.GeoShape;
import week10.Point;

public class clock implements Cloneable {
	
	
	private int clock;
	private String a; 
	
	public clock( clock m) {
		this.a=m.a;
		this.clock=m.clock;
		
	}
	

	public clock(int clock, String a) {
		this.clock = clock;
		this.a = a;
	}
	public clock clone() throws CloneNotSupportedException  {
		return (clock) super.clone();
	}
 

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + clock;
		return result;
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clock other = (clock) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (clock != other.clock)
			return false;
		return true;
	}


	public int getClock() {
		return clock;
	}


	public void setClock(int clock) {
		this.clock = clock;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}




	@Override
	public String toString() {
		return "clock [clock=" + clock + ", a=" + a + "]";
	}


	
	
	
	
	
	

}
