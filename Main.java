import java.util.Scanner;
import java.lang.*;

class Main{
	public static void main(String args[]){
		//Creates a scanner object to take user input
		Scanner choice = new Scanner(System.in);
		System.out.println("Enter a number to find the reverse factorial:");
		String to_reverse = choice.nextLine();
		System.out.println("The reverse factorial of " + to_reverse + " is " + factorial.ReverseFactorial(Integer.parseInt(to_reverse)) + "!");
	}
}