package trgool5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class stringTest {

	@Test
	void testSortstring() {
		String good="abcd";
		String notgood="dcba";
	assertEquals(good, string.sortstring(notgood));
	 good="abcd";
	 notgood="dbca";
	assertEquals(good, string.sortstring(notgood));
	 good="efgh";
	 notgood="ghfe";
	assertEquals(good, string.sortstring(notgood));
	 good="efgh";
	 notgood="ghfe";
	assertNotEquals(notgood, string.sortstring(good));
	assertEquals(good, string.sortstring(notgood));
	}
	@Test
	void testSortstring1() {
		String good="abcdddd";
		char a='d';
	assertEquals(string.sortstring(good,a), 4);
	 good="abcdddd";
	 a='s';
	assertEquals(string.sortstring(good,a), 0);
	 good="";
	 a='s';
	assertEquals(string.sortstring(good,a), 0);
	 good=" ";
	 a='s';
	 assertEquals(string.sortstring(good,a), 0);
	 good="kssgfnbfgngf";
	 a='s';
	 assertEquals(string.sortstring(good,a), 2);
	 good="ddds83ss6ff5999999f";
	 a='9';
	 assertEquals(string.sortstring(good,a), 6);
	
	}
	@Test
	void  string() {
		String good="Abc";
		String notgood="abc";
		 assertEquals(string.string(notgood), good);
		 System.out.print(string.string(notgood));
	}
	
	@Test
	void  string1() {
		String good="abc";
		assertTrue(string.string1(good));
		 good="sdf";
		 assertTrue(string.string1(good));
		 good="";
		 assertTrue(string.string1(good));
		 good="546";
		 assertFalse(string.string1(good));
		 good=" ";
		 assertFalse(string.string1(good));
	}
	
	

}
