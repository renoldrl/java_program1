package ownProgram;

public class Word_count_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="renold john";
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			String s="";
			
			while(i<ch.length && ch[i] !=' ') {
				
				s=s+ch[i];
				i++;
			}
			if(s.length()>0) 
				
			System.out.println(s+"--->"+s.length());
		}
		

		//reverse string
		String s=new StringBuffer(str).reverse().toString();
		System.out.println(s);
		
		//reverse string
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}
	
	


}
