package tergool4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {
	

	@Test
	void testMyLinkedList() {
		MyLinkedList tast=new MyLinkedList();
		assertNotEquals(tast.size(), 1);
		assertEquals(tast.size(), 0);
	}

	@Test
	void testAdd() {
		MyLinkedList tast=new MyLinkedList();
		tast.add("1");
		tast.add("2");
		tast.add("3");
		assertEquals(tast.size(), 3);
		assertNotEquals(tast.size(), 0);
	}
	@Test
	void testAddAt() {
	MyLinkedList tast=new MyLinkedList();
	tast.addAt("1", 0);
	tast.addAt("2", 1);
	tast.addAt("3", 2);
	assertEquals(tast.size(), 3);
	tast.addAt("4", 2);
	assertEquals(tast.size(), 4);
	
	}

	@Test
	void testSize() {
		MyLinkedList tast=new MyLinkedList();
		assertEquals(tast.size(), 0);
		tast.add("5");
		assertEquals(tast.size(), 1);
		tast.dalit(0);
		assertEquals(tast.size(), 0);
		
	}

	@Test
	void testNum() {
		MyLinkedList tast=new MyLinkedList();
		tast.add("1");
		tast.add("1");
		tast.add("2");
		tast.add("1");
		tast.add("2");
		tast.add("1");
		assertEquals(tast.num("1"), 4);
		assertEquals(tast.num("2"), 2);
		assertEquals(tast.num("0"), 0);
	}

	@Test
	void testSwop() {
	MyLinkedList tast1=new MyLinkedList();
	MyLinkedList tast2=new MyLinkedList();
	tast1.add("1");
	tast1.add("2");
	tast1.add("3");
	tast1.add("4");
	tast1.add("5");
	tast1.add("6");
	
	tast2.add("1");
	tast2.add("2");
	tast2.add("3");
	tast2.add("4");
	tast2.add("5");
	tast2.add("6");
	
	assertEquals(tast1.toString(),tast2.toString());
	System.out.println(tast1+" Equals "+tast2);
	tast2.swop(2, 3);
	assertNotEquals(tast1.toString(),tast2.toString());
	System.out.println(tast1+" NotEquals "+tast2);	
	}

	@Test
	void testDalit() {
		MyLinkedList tast1=new MyLinkedList();
		tast1.add("1");
		tast1.add("2");
		tast1.add("3");
		tast1.add("4");
		tast1.add("5");
		tast1.add("6");
		assertEquals(tast1.size(),6);
		tast1.dalit(5);
		assertEquals(tast1.size(),5);
		tast1.dalit(0);
		assertEquals(tast1.size(),4);
		tast1.dalit(3);
		assertEquals(tast1.size(),3);
			
	}

	@Test
	void testRevers() {
		MyLinkedList tast1=new MyLinkedList();
		tast1.add("1");
		tast1.add("2");
		tast1.add("3");
		tast1.add("4");
		tast1.add("5");
		tast1.add("6");
		MyLinkedList tast2=new MyLinkedList();
		tast2.add("1");
		tast2.add("2");
		tast2.add("3");
		tast2.add("4");
		tast2.add("5");
		tast2.add("6");
		assertEquals(tast1.toString(),tast2.toString());
		System.out.println(tast1+" Equals "+tast2);
		tast1.revers();
		assertNotEquals(tast1.toString(),tast2.toString());
		System.out.println(tast1+" NotEquals "+tast2);	
		
		
	}

	@Test
	void testToString() {
		MyLinkedList tast1=new MyLinkedList();
		tast1.add("1");
		tast1.add("2");
		tast1.add("3");
		tast1.add("4");
		tast1.add("5");
		tast1.add("6");
		Assert.assertTrue(tast1.toString().contentEquals("1>2>3>4>5>6"));
		
	}

}
