package ownProgram;

import java.util.Scanner;

public class Reverse_Sentance {
	
	public static void main(String[] args) {
	/*	
		
		System.out.println("enterh the string value");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		
		String[] str=word.split(" ");
		String rev="";
		
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+str[i]+" ";
		}
		System.out.println(rev);*/
		
		System.out.println("enter string value");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		
		String[] str=word.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+str[i]+" ";
		}
		System.out.println(rev);
		
	}

}
