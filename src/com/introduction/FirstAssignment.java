/**
 * 
 */
package com.introduction;

/**
 * @author Adeel Malik
 *
 */
public class FirstAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1309;
		int b = 1456;
		int a1 = 12;
		String b1 = "Friday";
		String c = "Sum = ";
		String d = "Difference = ";
		String e = "Product = ";
		String f = "Division = ";
		int x1 = a+b;
		int x2 = a-b;
		int x3 = a*b;
		double x4 = a/(double)b;
	    String x5 = String.format("%.02f", x4);
		System.out.println(c+x1);
		System.out.println(d+x2);
		System.out.println(e+x3);
		System.out.println(f+x5);
		
		if(a1 == 12 && b1 == "Friday")
		{ System.out.println("Its " + b1 +" "+ a1 + "th");}
		else
		{System.out.println("Its not Friday 12th");}
		
	}
	
	

}
