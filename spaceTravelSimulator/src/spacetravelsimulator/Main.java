package spacetravelsimulator;
import java.util.Scanner;

public class Main {
	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] astronautNames = new String[10];
		int[] astronautAges = new int[10];
		String[] missionStatus = new String[10];
		
		int numAstronauts = 0;
		
		while (true) {
			System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter astronaut's name: ");
                astronautNames[numAstronauts] = scanner.nextLine();
                System.out.print("Enter astronaut's age: ");
                astronautAges[numAstronauts] = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter mission status (On mission / Available): ");
                missionStatus[numAstronauts] = scanner.nextLine();
                numAstronauts++;
                break;
            case 2:
                // Status update logic
                break;
            case 3:
                // Display astronauts
                break;
            case 4:
                System.out.println("Exiting program.");
                scanner.close();
                return;
        }
		}
	}
	
	
}
