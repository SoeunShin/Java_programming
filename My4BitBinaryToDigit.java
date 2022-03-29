import java.util.Scanner;

public class My4BitBinaryToDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four bit binary value.");
		String binary = sc.next();
		System.out.println("The value of " + binary + " is " + Integer.parseInt(binary.substring(0), 2));
	}
}