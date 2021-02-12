package week9;
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Person.counter);
		Person p1 = new Person();
		System.out.println(Person.counter);
		Person p2 = new Person("Stam", "000000", 2.5);
		System.out.println(Person.counter);
		Person p3 = new Person("Stam1", "111", 2.5);
		Person p4 = new Person("Stam2", "222", 2.5);
		Person p5 = new Person("Stam3", "333", 2.5);
		System.out.println(Person.counter);
//		Person p6=p1;//here, we point at the same memory by both p6 and p1
//		Person p6=new Person(p4);
//		p4.name="klom";
//		System.out.println(p4.name);
//		System.out.println(p6.name);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		Person.PrintCounert();
	}

}
