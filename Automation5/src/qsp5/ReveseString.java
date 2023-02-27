package qsp5;

public class ReveseString {

	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("after reversing the string:" +rev);
		if(s.equals(rev)) {
			System.out.println("Palindrome String");
		}
			else {
				System.out.println("it is not a palindrome");
			}
		}

	}


