/*
 * Student
 * 	Santiago Aranda Hurtado
 */
package Multiple100;
import java.util.Scanner;
public class Multipleof100 {
	public static void main (String[]args) {
		// Prompt user for input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a interger between 100:");
		//the integer given to us by the user
		int Number = scanner.nextInt();
		// Validate if the input follows the rule
		if(Number>=100) {
			// gives us the remainder of the division between the integer and 100
			int remainder_of_the_division = Number%100;
			// Validate if the integer is divisible by 100 using the remainder of the division
			if (remainder_of_the_division == 0) {
				System.out.println(Number+ " multiple of 100");
			}else{
				System.out.println(Number+ " not multiple of 100");
			}
		}else {
			System.out.println("");
		}
		
		
	}
}
