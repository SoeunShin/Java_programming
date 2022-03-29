import java.util.Scanner;

public class MyKoreanChangeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a whole number from 1 to 10000.");
		int money = sc.nextInt();
		int num, change;
		
		System.out.println(money + " won in coins can be given as:");
		num = money / 500;
		change = money % 500;
		System.out.println(num + " 500 won");
		num = change / 100;
		change %= 100;
		System.out.println(num + " 100 won");
		num = change / 10;
		change %= 10;
		System.out.println(num + " 10 won");
		num = change / 5;
		change %= 5;
		System.out.println(num + " 5 won");
		num = change / 1;
		change %= 1;
		System.out.println(num + " 1 won");
	}
}
