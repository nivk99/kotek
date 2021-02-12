package week9;

public class talp {
	private int kool;
	private String name;
	static int number;

	public talp(int kool, String name) {
		this.kool = kool;
		this.name = name;
	}
	public talp() {
		this(0,"");
	}
	public int length() {
		return name.length();
	}
	public char charAt(int index) {
		return name.charAt(index);
	}
	public int getKool() {
		return kool;
	}
	public void setKool(int kool) {
		this.kool = kool;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void nextneam(talp a) {
		this.name=a.name;
		
	}
	
	


}
