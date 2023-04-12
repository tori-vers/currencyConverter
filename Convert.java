package currencyConverter;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the amount of US dollars to convert: ");
		double amount = myObj.nextDouble();
		double canadian = amount * 1.35;
		
		System.out.printf("%.2f American Dollars is equal to %.2f Canadian Dollars.", amount, canadian);

}
}

// i hate JAVA
