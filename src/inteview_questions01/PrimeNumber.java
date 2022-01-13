package inteview_questions01;

import java.util.Scanner;

public class PrimeNumber {
	//Ask user enter a positive number and check if it is prime or not


	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a positive number");
		int num=scan.nextInt();
		
		
	    boolean flag = false;
	    for (int i = 2; i <= num/2 ; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}
