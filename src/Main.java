import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Your challenge is to read in a price
		// Read in the amount paid
		// Print out the amount of change
		// Break the change into all denominations:
		// $100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		// As a bonus, make your project round to the nearest $0.05 like actual stores.
		double Due = 0.0;
		System.out.println("What is the cost of all your items?");
		double Price = in.nextDouble();
		System.out.println("Your total is " + Math.round(Price * 100) / 100.0 + " How much did you pay?");
		double Paid = in.nextDouble();
		Paid = Math.round(Paid * 100) / 100.0;
		in.close();

		if (Price > Paid) {
			System.out.println("You do not have enough, please try again later");
			System.exit(0);
		} else if (Price - Paid == 0) {
			System.out.println("You are owed no change");
			System.exit(0);
		} else {
			Due = (Paid - Price);
			System.out.println("You are owed $" + Due);
		}

		int Hundreds = (int) (Due / 100);
		Due = (Due - Hundreds * 100);
		int Fifties = (int) (Due / 50);
		Due = (Due - Fifties * 50);
		int Twenties = (int) (Due / 20);
		Due = (Due - Twenties * 20);
		int Tens = (int) (Due / 10);
		Due = (Due - Tens * 10);
		int Fives = (int) (Due / 5);
		Due = (Due - Fives * 5);
		int Twos = (int) (Due / 2);
		Due = (Due - Twos * 2);
		int Ones = (int) (Due / 1);
		Due = (Due - Ones * 1);
		int Quarters = (int) (Due / 0.25);
		Due = (Due - Quarters * 0.25);
		int Dimes = (int) (Due / 0.1);
		Due = (Due - Dimes * 0.1);
		int Nickels = (int) (Due / 0.05);
		Due = (Due - Nickels * 0.05);

		if (Due >= 0.03 && Due <= 0.04) {
			Nickels++;
		}

		System.out.println("That is:");
		if (Hundreds != 0) {

			System.out.println(Hundreds + " Hundred(s)");
		}
		if (Fifties != 0) {
			System.out.println(Fifties + " Fiftie(s)");

		}

		if (Twenties != 0) {
			System.out.println(Twenties + " Twentie(s)");

		}

		if (Tens != 0) {
			System.out.println(Tens + " Ten(s)");

		}
		if (Fives != 0) {
			System.out.println(Fives + " Five(s)");

		}
		if (Twos != 0) {
			System.out.println(Twos + " Two(s)");

		}
		if (Ones != 0) {
			System.out.println(Ones + " One(s)");

		}
		if (Quarters != 0) {
			System.out.println(Quarters + " Quarter(s)");

		}
		if (Dimes != 0) {
			System.out.println(Dimes + " Dime(s)");

		}
		if (Nickels != 0) {
			System.out.println(Nickels + " Nickel(s)");

		}

	}
}
