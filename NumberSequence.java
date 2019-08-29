package BasicsOfImplementation;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean dec=true;
		int prev=s.nextInt();
		int next;
		
		while(n-1>0) {
			n--;
			 next=s.nextInt();
			
		

		if(next<prev) {
			
			if(!dec) {
				return false;
			}
		
		}
		
		else if(prev<next) {
			
			return false;
			
		}
		 
		else
			dec=false;
	
		prev=next;
	
	}	
	
	
	return true;

		

	
	}
	
	
	
	

	static boolean number_sequence() {
		
			

	}
	
	
	
	
	
	
}
