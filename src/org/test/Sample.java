package org.test;

public class Sample {
	
	public static void main(String[] args) {
		String s="java programming";
		StringBuffer s1= new StringBuffer(s);
	  int uc=0, lc=0;
	  
	  for(int i=0;i<s.length();i++) {
		  char ch = s.charAt(i);
		  if(Character.isUpperCase(ch)) {
			  s1.setCharAt(i, Character.toLowerCase(ch));
			  lc++;
		  }
		  else if(Character.isLowerCase(ch)) {
			  s1.setCharAt(i, Character.toUpperCase(ch));
			  uc++;
		  }
		  
	  }
		System.out.println(s1);
		 System.out.println("uc"+uc);
		 System.out.println("lc"+lc);
		
		System.out.println("karthika");
		System.out.println(" changerd");
	}

}
