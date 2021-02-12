package week9;

public class name extends Person {
	private String KOOL;
	static int counter=0;
	
	public name() {
		this.name="";
		this.ID="";
		this.KOOL="";
		counter++;
		print();
	}
	public name(String n,String i,String k) {
		this.name=n;
		this.ID=i;
		this.KOOL=k;
		counter++;
		print();
	}
	public static void print(){
		System.out.println(counter);
		
	}
	public name(name copy) {
		this.name=copy.name;
		this.ID=copy.ID;
		this.KOOL=copy.KOOL;
	}
	public String toString() {
		return "name:"+""+this.name+ "\n"+ "Id:"+""+this.ID+"\n"+"kool:"+""+this.KOOL;
		
	}
	public void othername(name k) {
		this.name=this.name+" and " +k.name;
	}
	
	
	
	
	

}
