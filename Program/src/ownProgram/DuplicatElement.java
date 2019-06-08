package ownProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dupulicate[]=new String[]{"reno","john","reno"};
		
		Set Nonduplicate=new HashSet<>();
		Set duplicate=new HashSet<>();
		
		for (String str : dupulicate) {
			if(!Nonduplicate.contains(str)) {
				Nonduplicate.add(str);
				
			}else {
				duplicate.add(str);
			}
				
			
		}
		System.out.println(duplicate);
		//System.out.println("nonduplicate is "+Nonduplicate);
		
	}

}
