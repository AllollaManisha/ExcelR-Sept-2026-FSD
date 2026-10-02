package day2;
import java.util.Scanner;
public class AdditionTwoNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number 1");
		int n1=sc.nextInt();
		System.out.println("Please enter number 2");
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		System.out.println("The Sum is "+ sum);
		

	}

}
