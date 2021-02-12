package week12;
public class LLTest {
	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		System.out.println(lst.removeFirst());
		System.out.println(lst);
		lst.AddFirst(10);
		System.out.println(lst.removeFirst());
		System.out.println(lst);
		lst.AddFirst(-9);
		lst.AddFirst(17);
		for (int i = 0; i < 20; i++) {
			int curr = (int) (Math.random() * 10);
			lst.AddLast(curr);
			System.out.println(curr + " has been added");
		}
		System.out.println(lst);
		lst.removeFirst();
		System.out.println(lst);
		lst.removeLast();
		System.out.println(lst);
		System.out.println(lst.remove(5));
		System.out.println(lst);
		lst.removeAllOuccurences(9);
		System.out.println(lst);
	}
}
