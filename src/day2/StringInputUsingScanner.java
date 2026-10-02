package day2;

import java.util.Scanner;

public class StringInputUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		//String name=sc.next();  //entire string
		char ch=sc.next().charAt(0);  // only '0' index character  
		System.out.println(ch);

	}

}
