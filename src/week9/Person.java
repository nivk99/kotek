package week9;
public class Person {
	 String name;
      String ID;
	private double hieght;
	 static int counter = 0;

	public Person(String name, String ID, double h) {
		this.name = name;
		this.ID = ID;
		this.hieght = h;
		counter++;
	}

	public Person() {
		this("", "", 0.0);
	}

	public Person(Person other) {
		this.name = other.name;
		this.ID = other.ID;
		this.hieght = other.hieght;
		counter++;
		PrintCounert();
	}
	public String toString() {
		return "Person [name: "+this.name+", ID: "+this.ID+", Hieght: "+this.hieght+"]";
	}
	public static void PrintCounert() {
		System.out.println(counter);

	}
}
