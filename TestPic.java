package eg.edu.alexu.csd.datastructure.iceHockey.cs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPic {

	@Test
	public void test0() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"BU33"
				  		  ,"4433"
				  		  ,"44NB"
				  		  ,"SDP3"};
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(6,2);
		assertArrayEquals(test.findPlayers(image, 3, 16),testCase);
	}
	
	@Test
	public void test1() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"33JUBU33",
						  "3U3O4433",
						  "O33P44NB",
						  "PO3NSDP3",
						  "VNDSD333",
						  "OINFD33X"} ;
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(4,5);
		testCase[1] = new java.awt.Point(13,9);
		testCase[2] = new java.awt.Point(14,2);
		assertArrayEquals(test.findPlayers(image, 3, 16),testCase);
	}
	
	@Test
	public void test2() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"44444H44S4",
				   		  "K444K4L444",
				   		  "4LJ44T44XH",
				   		  "444O4VIF44",
				   		  "44C4D4U444",
				   		  "4V4Y4KB4M4",
				   		  "G4W4HP4O4W",
				   		  "4444ZDQ4S4",
				   		  "4BR4Y4A444",
						"4G4V4T4444"};
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(3,8);
		testCase[1] = new java.awt.Point(4,16);
		testCase[2] = new java.awt.Point(5,4);
		testCase[3] = new java.awt.Point(16,3);
		testCase[4] = new java.awt.Point(16,17);
		testCase[5] = new java.awt.Point(17,9);
		assertArrayEquals(test.findPlayers(image, 4, 16),testCase);
	}
	
	@Test
	public void test3() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"8D88888J8L8E888",
						  "88NKMG8N8E8JI88",
						  "888NS8EU88HN8EO",
						  "LUQ888A8TH8OIH8",
						  "888QJ88R8SG88TY",
						  "88ZQV88B88OUZ8O",
						  "FQ88WF8Q8GG88B8",
						  "8S888HGSB8FT8S8",
						  "8MX88D88888T8K8",
						  "8S8A88MGVDG8XK8",
						  "M88S8B8I8M88J8N",
						  "8W88X88ZT8KA8I8",
						  "88SQGB8I8J88W88",
						  "U88H8NI8CZB88B8",
						  "8PK8H8T8888TQR8"};
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(1,17);
		testCase[1] = new java.awt.Point(3,3);
		testCase[2] = new java.awt.Point(3,10);
		testCase[3] = new java.awt.Point(3,25);
		testCase[4] = new java.awt.Point(5,21);
		testCase[5] = new java.awt.Point(8,17);
		testCase[6] = new java.awt.Point(9,2);
		testCase[7] = new java.awt.Point(10,9);
		testCase[8] = new java.awt.Point(12,23);
		testCase[9] = new java.awt.Point(17,16);
		testCase[10] = new java.awt.Point(18,3);
		testCase[11] = new java.awt.Point(18,11);
		testCase[12] = new java.awt.Point(18,28);
		testCase[13] = new java.awt.Point(22,20);
		testCase[14] = new java.awt.Point(23,26);
		testCase[15] = new java.awt.Point(24,15);
		testCase[16] = new java.awt.Point(27,2);
		testCase[17] = new java.awt.Point(28,26);
		testCase[18] = new java.awt.Point(29,16);
		assertArrayEquals(test.findPlayers(image, 8, 9),testCase);
	}
	
	@Test
	public void test4() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"11111",
						  "1AAA1",
						  "1A1A1",
						  "1AAA1",
						  "11111"};
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(5,5);
		testCase[1] = new java.awt.Point(5,5);
		assertArrayEquals(test.findPlayers(image, 1, 1),testCase);
	}
	
	@Test
	public void test5() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {};
		assertArrayEquals(test.findPlayers(image, 3, 16),null);
	}
	
	@Test
	public void test6() {
		PlayersFinder test = new PlayersFinder();
		String[] image = null;
		assertArrayEquals(test.findPlayers(image, 3, 16),null);
	}

	@Test
	public void test7() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"ASDRTHBCD",
						  "QWERTYUIO",
						  "ASDFGHJKL",
						  "ZXCVBNMLK"};
		assertArrayEquals(test.findPlayers(image, 3, 9),null);
	}
	
	@Test
	public void test8() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"A1SDRTHB1CD",
						  "QWE1RTY1UIO",
						  "ASDFGHJKL11",
						  "ZXC1VBN1MLK"};
		assertArrayEquals(test.findPlayers(image, 3, 1),null);
	}
	
	@Test
	public void test9() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"1"};
		java.awt.Point[] testCase = new java.awt.Point[10000];
		testCase[0] = new java.awt.Point(1,1);
		assertArrayEquals(test.findPlayers(image, 1, 1),testCase);
	}
	
	@Test
	public void test10() {
		PlayersFinder test = new PlayersFinder();
		String[] image = {"33JUBU33",
						  "3U3O4433",
						  "O33P44NB",
						  "PO3NSDP3",
						  "VNDSD333",
						  "OINFD33X"};
		assertArrayEquals(test.findPlayers(image, 3, 50),null);
	}
	
}
