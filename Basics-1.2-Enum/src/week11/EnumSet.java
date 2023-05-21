package week11;

import java.util.Scanner;

enum State {
	SUNNY, OVERCAST, RAINING
};

public class EnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean finished = false;
		char command;
		String inString;
		State current = State.OVERCAST;

		Scanner in = new Scanner(System.in);

		while (!finished) {
			System.out.println("Weather state :" + current);
			System.out.print("Enter i for improving, d for deteriorating:");

			inString = in.nextLine();
			command = inString.charAt(0); // get 1st character from string

			switch (command) {
			case 'i':
				current = improveState(current);
				break;
			case 'd':
				current = worsenState(current);
				break;
			default:
				finished = true; // any other char ends program
			} // case

		} // while

	}

	public static State improveState(State present) {
		switch (present) {
		case RAINING:
			present = State.OVERCAST;
			break;
		default:
			present = State.SUNNY;
			// return an improved state
		}
		return present;
	}

	public static State worsenState(State present) {
		switch (present) {
		case SUNNY:
			present = State.OVERCAST;
			break;
		default:
			present = State.RAINING;
			// return an improved state
		}
		return present;
		// return a worsened state
	}
}
