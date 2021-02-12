package week12;
public class GNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GNode<Integer> p=new GNode<Integer>(3,null);
		GNode<String> p2=new GNode<String>("abc",p);
		GNode<String> p3=new GNode<String>("hij",p2);
		GNode<String> p4=new GNode<String>("lll",p3);
		GNode<Integer> p5=new GNode<Integer>(-9,p4);
		GNode<Integer> p6=new GNode<Integer>(10,p5);
		GNode t=p6;
		while(t.getNext()!=null) {
			System.out.println(t+" ");
			t=t.getNext();
		}
	}

}
