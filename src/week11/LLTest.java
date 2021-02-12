package week11;
public class LLTest {
	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		System.out.println(lst.getFirst());
		lst.Add(5);
		System.out.println(lst.getFirst());
		lst.Add(6);
		System.out.println(lst.getFirst().getNext());
		lst.Add(7);
		System.out.println(lst.getFirst().getNext().getNext());
	//	System.out.println(lst.getFirst());
		//System.out.println(lst.getFirst().getNext());
		//lst.Add(-9);
		//System.out.println(lst.getFirst());
		//System.out.println(lst.getFirst().getNext());
		//lst.Add(17);
	//	System.out.println(lst.getFirst());
	//	System.out.println(lst.getFirst().getNext());

	}
}
