package Methods;
import java.util.Scanner;

public class UserDefinedMethods {
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedMethods ins= new UserDefinedMethods();
		ins.b=20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tenth marks");
		int scoreTenth= sc.nextInt();
		System.out.println("Enter twelve marks");
		int scoreTwelve = sc.nextInt();
		System.out.println("Enter PCM aggregate marks");
		int pcmAggre= sc.nextInt();
		
		int sumTenthandtwelve= scoreTenth+scoreTwelve;
		int aggreTenthandtwelve =(sumTenthandtwelve/2);
		if((aggreTenthandtwelve>90) && (pcmAggre>92)){
			System.out.println("Eligible for enrolment");
		}
		else{
			System.out.println("Not eligible for enrolment");
		}

	}

}
