package week8;
public class Car2Test {
	// my solution of a question from a student: how do we change upper case letters to lower and vice versa..
	public static String UpperToLowerVV(String st) {
		String st1 = "";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
				st1 = st1 + (char) (st.charAt(i) - 'A' + 'a');
			} else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				st1 = st1 + (char) (st.charAt(i) - 'a' + 'A');
			} else {
				st1 = st1 + st.charAt(i);
			}
		}
		return st1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1;

		c1 = new Car2();
//		System.out.println(c1.Manufacturer+", "+c1.Color);
//		System.out.println(c1.Color);
//		c1.Color = "Red";
//		System.out.println(c1.Color);
//		c1.fuel-=0.05;
//		System.out.println(c1.fuel);
//		System.out.println(c1.year);
		System.out.println(c1);
//		c1.Move();
//		c1.Move();

		Car2 c2 = new Car2("B.M.W", "i8", 2009, "Pure White", 0.67);
		System.out.println(c2);
//		System.out.println(c2.fuel);
		
		String st = "ABCDEF";
		System.out.println(UpperToLowerVV("AbCDEfghi 28493 3nlnm"));
		
	}

}
