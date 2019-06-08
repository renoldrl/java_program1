package ownProgram;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("enter string value");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		//1 st method
		//char[] character=str.toCharArray();
		String s=new StringBuffer(str).reverse().toString();
		System.out.println(s);
		
		
		
		
		//2nd method
		char[] character=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(character[i]);
		}
	}

}
