package question.inter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class InterQuestion {

	@Test
	private void question_1() {
		// TODO Auto-generated method stub

		System.out.println(3 + 5);
		System.out.println(1 % 10);
		System.out.println(4454 % 2 + "ghg");
		System.out.println(2 / 5);
		System.out.println(804545 % 5);
		System.out.println(80 / 5);
		System.out.println(451 % 2);
		System.out.println(88 % 2);

	}

	@Test
	private void question_2() {
		// TODO Auto-generated m

		System.out.println("Print 1 to 100 Number");
		for (int i = 1; i <= 100; i++) {

			System.out.println(i);

		}
		/// Print number which is divisible by 4
		System.out.println("Print number which is divisible by 4");
		for (int i = 0; i < 50; i++) {

			if (i % 4 == 0) {
				System.out.println(i + " Even");

			}
//			else {
//			System.out.println(i+"Odd");
//			}

		}
		/// Print number which is divisible by 4
		System.out.println("Print number which is divisible by 4");
		for (int i = 0; i < 50; i++) {

			if (i % 4 == 0) {
				System.out.println(i + " Even");
				int div = (i / 2);
				System.out.println(div + " / by 2");
			} else if (i % 5 == 0) {
				System.out.println(i + " / by 5");
			}

		}

	}

	@Test
	private void question_3() {
		// TODO Auto-generated method stub
		int input = 87403;
		int fetch;
		int store = 0;

		while (input > 0) {
//				1.fetch  the last number by using %
			fetch = input % 10;
//				2.to increase our digit 
			store = (store * 10) + fetch;
//				3.remove the last number 
			input = input / 10;
		}
		System.out.println(store);
	}

	@Test
	private void question_4() {
		// TODO Auto-generated method stub

		String intp = "abcba";
		int count = 0;

		char[] charArray = intp.toCharArray();// for literation in for loop it been covert into array;

		for (char cal : charArray) {

			int indf = intp.indexOf(cal);// cal -t ->0; 2.--r -->1
			int indl = intp.lastIndexOf(cal);// cal t -->4;2.--r-->1
			System.out.println("hold " + cal + indf + indl);

			// 0 4 --false
			// 1 1 --true
			count++;
			if ((indf) == (indl)) {

				System.out.println(indf + indl + "condition true " + count);
				break;// --->Terminate loop
			}
		}
	};

	@Test
	private void question_5() {

		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char ch = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + ch);

	}

	private char firstNonRepeatedCharacter(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> characterhashtable = new LinkedHashMap<Character, Integer>();
		int length = str.length();// -->Total length of string
		System.out.println(length + "---length of string");
		Character ch;
		// Scan string and build hash table
		for (int i = 0; i < length; i++) {
			ch = str.charAt(i);// -->fetch char at index value i

			// check containkey for char --false
			if (characterhashtable.containsKey(ch)) {
				boolean containsKey = characterhashtable.containsKey(ch);

				System.out.println(ch + "containskey");
				// increment count corresponding to ch
				characterhashtable.put(ch, characterhashtable.get(ch) + 1);
			} else {
				System.out.println(ch + "put");
				characterhashtable.put(ch, 1);
			}
		}

		System.out.println(characterhashtable);
		for (Entry<Character, Integer> entry : characterhashtable.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return 0;

	}

	@Test
	private void question_6() {
		/*
		 * output 1 1 2 1 2 3
		 */

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		;
	}

	@Test
	private void question_7() {
		// input ="java selenium "
		// output ="avaj muineles"

		String input = "java selenium";

		char[] charInput = input.toCharArray();
		char[] result = new char[charInput.length];

		for (int i = 0; i <= (charInput.length); i++) {

			if (charInput[i] == ' ') {

				result[i] = charInput[i];

			}
		}

		System.out.println(result);

	}

	@Test
	private void question_8() {
		// TODO Auto-generated method stub
		String name = "im manoj kumar";
		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {

			System.out.println();
		}
	}

	@Test
	private void test_try() {
		// TODO Auto-generated method stub
		System.out.println(14546 % 10);

		System.out.println(15 % 10 + " nre ");
		int count = 0; // initialise

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count = count + 1;
			}

		}
		System.out.println(" no of even number  " + count);
	}

	@Test
	private void test_try1() {
		// divisible by 4
		int num = 12;

		int length = String.valueOf(num).length();
		System.out.println(length);

		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}

	}

	@Test
	private void test_try2() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	@Test
	private void test_try3() {
		// TODO Auto-generated method stub
		int input = 1451515;
		int srt = 0;
		int cent = 0;
		while (input > 0) {

//			to fetch the last number 

			cent = input % 10;
			System.out.println("cent " + cent);
//			to increase the value dec

			srt = (srt * 10) + cent;
			System.out.println("srt" + srt);

			// remove the last number

			input = input / 10;

		}
		System.out.println(srt);
	}

	@Test
	private void test_try4() {
		// TODO Auto-generated method stub
		int number = 4567, str = 0, res = 1;
		while (number > 0) {
			// To Fetch the last number
			str = number % 10;
			// To multiple from last number
			res = res * str;
			// remove the last number
			number = number / 10;
		}
		System.out.println(res);
	}

	@Test
	private void test_try5() {
		// swaping variable with help of third variable
		int a = 40;
		int b = 60;
		System.out.println("a--" + a + " b--" + b);

		int c = b; // c-60
		b = a; // b=40
		a = c; // a=60
		System.out.println("swaping variable with 3rd variable  " + " a--> " + a + " b--> " + b);

		a = a + b; // a=60 + 40-->100
		b = a - b; // b=100-40-->60
		a = b - a; // a=60-100-->40

		System.out.println("swaping variable a ,b   " + " a--> " + a + " b--> " + b);

	}

	@Test
	private void test_try6() {
		// enter number 1 to 20 by multiple
		System.out.println("Enter the number -");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int multi = 1;
		int count = 0;

//		int length = String.valueOf(number).length();		

		for (int i = 1; i <= number; i++) {

			multi = multi * i;
			count++;

		}
		System.out.println("multiply--" + multi);
		System.out.println("count --" + count);
	}

	@Test
	private void test_try7() {
		// fiabonn series

		int a = 2;
		int b = 3;

		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i < 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

	@Test
	private void test_try8() {
		// Reserve string "Grammer"

		System.out.println("Enter name ");

		Scanner strt = new Scanner(System.in);
		String Str = strt.next();

		String name = "";
		int lenNum = Str.length();
		System.out.println(lenNum);

		for (int i = lenNum - 1; i >= 0; i--) {

			char charAt = Str.charAt(i);

			name = name + charAt;

		}
		System.out.println(name);

		String lastext = "";

		for (int i = lenNum - 1; i >= 0; i--) {

			char front = name.charAt(i);
			lastext = lastext + front;
//			System.out.println("last String "+lastext);

		}
		System.out.println("last String " + lastext);
	}

	@Test
	private void test_try9() {
		// hai manoj kumar output=iah jonam ramuk

//		Scanner scan=new Scanner(System.in);
		String strname = "manoj kumar"; /// scan.next();

		String[] splitspace = strname.split(" ");

		System.out.println(splitspace);

		String res = "";

		for (String w : splitspace) {

			String stor = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				char charAt = w.charAt(i);

				stor = stor + charAt;
			}
			System.out.println(stor);
			res = res + stor + " ";
		}

		System.out.println(res.trim());

	}

	@Test
	private void test_try10() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test
	private void test_try11() {
		// TODO Auto-generated method stub

//		int last=0,str=0;

		for (int n = 1; n <= 100; n++) {
			int last1 = 0, str1 = 0;
			int a = n;
			while (a > 0) {

				last1 = a % 10;

				str1 = (str1 * 10) + last1;
				System.out.println(str1);
				a = a / 10;
//				System.out.println(a);
			}

			if (n == str1) {
				System.out.println(n + " str --" + str1);
			}

		}
	}

	@Test
	private void test_try12() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String in = input.next();

		for (int i = 0; i <= in.length() - 1; i++) {

			char charvl = in.charAt(i);

			if (Character.isAlphabetic(charvl)) {

				System.out.print(charvl);
			}

		}
		System.out.println(" ");
	}

	@Test
	private void test_try13() {
		// TODO Auto-generated method stub
		String s1 = "java", s2 = "program";

		s1 = s1 + s2;
		System.out.println(s1);

		s2 = s1.substring(0, s1.length() - s2.length());
		System.out.println("s2=s1.substring(0," + (s1.length() - s2.length()) + ")");
		s1 = s1.substring(s2.length());
		System.out.println("swap " + "s1 =" + s1 + "s2 =" + s2);

	}

	@Test
	private void countLetter() {
		// TODO Auto-generated method stub
		String val = "Manoj kumar k pooda ";
		String s = val.replace(" ", "");

		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			char ci = s.charAt(i);
			if (mp.containsKey(ci)) {

				Integer in = mp.get(ci);
				mp.put(ci,in+1);
			} else {
				mp.put(ci, 1);
			}
		}
		System.out.println(mp);
	}

	@Test
	private void counterWord() {
		// TODO Auto-generated method stub
		String word="hi bye hello pooda dude bye pooda bye hi pooda ";
		
		String[] spt = word.split(" ");
		
		Map<String, Integer> con=new LinkedHashMap<String, Integer>();
		for (String string : spt) {
			if(con.containsKey(string)) {
				Integer in = con.get(string);
				con.put(string,in+1);
				}
			else {
				con.put(string, 1);
			}
		}
		System.out.println(con);
		
		Collection<Integer> vals = con.values();
		
		Integer max = Collections.max(vals);
		
		Set<Entry<String, Integer>> col=con.entrySet();
		
		for (Entry<String, Integer> entry : col) {
			
			if(entry.getValue()==max) {
				System.out.println("high value key is "+entry.getKey());
			}
			
		}
				
	}
	
	@Test
	private void numberCount() {
		// TODO Auto-generated method stub
		int t[]= {10,20,50,40,40,50,80,70,20,90,10,20,90};
		
		Map<Integer, Integer> lo=new LinkedHashMap<Integer, Integer>();
		
		for (int l : t) {
			
			if(lo.containsKey(l)) {
				
				Integer in = lo.get(l);
				lo.put(l,in+1);
			}
			else {
				lo.put(l,1);
			}
		}
		System.out.println(lo);
		
		Collection<Integer> vals = lo.values();
		Integer max = Collections.max(vals);
		
		Set<Entry<Integer, Integer>> es = lo.entrySet();
		for (Entry<Integer, Integer> entry : es) {
			
			if(entry.getValue()==max) {
				System.out.println("max times repeat"+entry.getKey());
			}
			
		}
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}