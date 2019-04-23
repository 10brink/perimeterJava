import java.util.Scanner;

public class perimeter {

	public static void main(String[] args) {

		// boolean bool = true;
		String answer = "";
		do {
			System.out.println("enter the length: ");
			Scanner scnr = new Scanner(System.in);
			double len = scnr.nextDouble();
			System.out.println("enter the width: ");
			double width = scnr.nextDouble();

			double area = len * width;
			double perim = 2 * len + 2 * width;

			double volume = len * width * 9;

			System.out.println("area: " + area);
			System.out.println("perimeter: " + perim);
			System.out.println("volume: " + volume);

			scnr.nextLine(); // garbage collection

			System.out.println("do you want to calculate another room? (y/n)");
			answer = scnr.nextLine(); // change to char so it takes the first letter only
			// scnr.nextLine();
			// scnr.close();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye");

	}

}
