package com.string;

public class TestString {
	
	public void over() {
		
	}
	public static void main(String[] args) {
		String a = "Ani";
		String b = "mal";
		String c = a.concat(b);
		StringBuilder builder = new StringBuilder(c);
		System.out.println(builder.reverse());
		
		String rev = "";
		for (int i = c.length() - 1; i >= 0; i--) {
			rev += c.charAt(i);
		}
		char[] cc = c.toCharArray();
		for (int i = cc.length-1; i >=0; i--) {
			System.out.print(cc[i]);
		}
	
		
		/*System.out.println(rev);

		StringBuffer s = new StringBuffer("Geeksfor");
		s.append("Geeks");
		System.out.println(s); // returns GeeksforGeeks
		s.append(1);
		System.out.println(s); // returns GeeksforGeeks1
*/
		
		
		/*String str = "sssgeekss@for@geekss";
		String[] arrOfStr = str.split("s",-1);
		for (String aa : arrOfStr)
		System.out.println(aa);	*/
		
		/*String a = "Mohan";
		String b = "So";
		b = a.concat(b);//MohanSo
		System.out.println(b);
		a = b.substring(a.length());
		System.out.println(a);
		b = b.substring(0,b.length()-a.length());
		System.out.println(a+" "+b);*/
		

	}
	


}
