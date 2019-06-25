import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		char userDecision = 'y';
		double length;
		double width;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("Please Enter Length of the room");
			length = scanner.nextDouble();
			System.out.println("Please Enter Width of the room");
			width = scanner.nextDouble();
			System.out.println("length is " + length);
			System.out.println("Width is " + width);
			System.out.println("Area is " + length * width);
			System.out.println("Perimeter is " + (2 * (length + width)));
			System.out.println("Do you want to proceed? y/n");
			userDecision = scanner.next().charAt(0);

		} while (userDecision == 'y');
		System.out.println("Bye");
		scanner.close();
	}

}
