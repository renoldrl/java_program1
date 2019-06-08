package ownProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		int count=0;
		for(int i=0;i<=100;i++) {
			if(prim(i)) {
				System.out.print(i+" ");
				count++;
				
			}
		}
		System.out.println();
		System.out.println(count);
	}

	private static boolean prim(int n) {
		// TODO Auto-generated method stub
		
		if(n<=1) {
			return false;
			
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
