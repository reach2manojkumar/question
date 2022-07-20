package question.inter;

import java.util.Arrays;

import org.testng.annotations.Test;

public class InterviewQuestion2 {

	@Test
	private void ques1() {
		// TODO Auto-generated method stub
		// check Anagram
		String str1 = "manoj";
		String Str2 = "jOnAm";

		String ca1 = str1.toUpperCase();
		String ca2 = Str2.toUpperCase();

		int length = str1.length();
		int length2 = Str2.length();

		if (length == length2) {

			char[] ar = ca1.toCharArray();
			char[] ar1 = ca2.toCharArray();

			Arrays.sort(ar);
			Arrays.sort(ar1);

			if (Arrays.equals(ar, ar1)) {

				System.out.println("corrent");
			}
			else 
			{
				System.out.println("mismatch ");
			}
		}
	}
	@Test
	private void ques2() {
		// TODO Auto-generated method stub
		
		System.out.println("check the vowel and consonantsn count ");
		
		String str="sakh hajh jahdj jasbdhajue csfscjajbjab";
	}	

	@Test
	private void ques3() {
		// TODO Auto-generated method stub
		
	}
}
