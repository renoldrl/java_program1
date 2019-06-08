package ownProgram;

public class PrimeNumber2 {

	
	public static boolean prime(int n) {
		
		if(n<1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
			return false;
		}
	}
	
	return true;
}
	
	public static void main(String[] args) {
		
		int n=50;
		int count=0;
		
		for(int i=0;i<=n;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
				count++;
				
			}
		}
	}
}