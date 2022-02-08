package JavaAssignments;

import java.util.Scanner;

public class AssignmentEleven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		String ar =sc.next();
		
		char ch =ar.charAt(0);
		
		int asciiValue =ch;
		
		if(asciiValue>=65 && asciiValue <= 90){
			System.out.println("Entered Character is Capital letter");
		}
		else if(asciiValue>=97 && asciiValue <= 122){
			System.out.println("Entered Character is Smaller case letter");
		}
		else if(asciiValue>=48 && asciiValue <= 57){
			System.out.println("Entered Character is a Digit");
		}
		else{
			System.out.println("Entered Character is a Special symbol");
		}
		
		

	}

}
