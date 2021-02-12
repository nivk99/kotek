package tegol2;

public class Student {
	
	private String Name;
	private int  Age;
	private double Average;
	
	public Student(String name, int age, double average) {
		Name = name;
		Age = age;
		Average = average;
	}

	public Student(String name, int age) {
		Name = name;
		Age = age;
		Average =0;
	}
	
	public Student() {
		this(null,0,0);
	}
	
	
	public Student(Student s) {
		this(s.Name,s.Age,s.Average);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getAverage() {
		return Average;
	}

	public void setAverage(double average) {
		Average = average;
	}

	public String toString() {
		return "Student [Name=" + Name + ", Age=" + Age + ", Average=" + Average + "]";
	}

	
	public boolean equals(Student obj) {
		if(obj.Age==this.Age) {
			if(obj.Average==this.Average) {
				return true;
			}
		}
		
			return false;
		
	}
	

	
	
	
	
	
	
}

