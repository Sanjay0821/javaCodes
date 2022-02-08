package JavaAssignments;
import java.util.Scanner;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a =sc.nextInt();
		if(a % 2==0){
			System.out.println("The value is Even");
		}else{
			System.out.println("The value is Odd");
		}
	}

}
