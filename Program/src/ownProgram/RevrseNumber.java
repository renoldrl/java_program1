package ownProgram;

public class RevrseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		String numstring=String.valueOf(num);
		String reverse="";
		
		for(int i=numstring.length()-1;i>=0;i--) {
			reverse=reverse+numstring.charAt(i);
		}
		System.out.println(Integer.valueOf(reverse));
	}

}
