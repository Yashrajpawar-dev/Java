import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fitness Tracker App!");
        boolean exit = false;

        int steps = 0;
        double distance = 0.0; // in kilometers
        int caloriesBurned = 0;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Steps");
            System.out.println("2. View Stats");
            System.out.println("3. Reset Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of steps: ");
                    int newSteps = scanner.nextInt();
                    steps += newSteps;
                    distance += newSteps * 0.0008; // Assuming 1 step = 0.8 meters
                    caloriesBurned += newSteps * 0.05; // Assuming 1 step burns 0.05 calories
                    System.out.println(newSteps + " steps added.");
                    break;

                case 2:
                    System.out.println("\nYour Stats:");
                    System.out.println("Steps: " + steps);
                    System.out.println("Distance: " + String.format("%.2f", distance) + " km");
                    System.out.println("Calories Burned: " + caloriesBurned + " kcal");
                    break;

                case 3:
                    System.out.println("Are you sure you want to reset data? (yes/no)");
                    String confirm = scanner.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        steps = 0;
                        distance = 0.0;
                        caloriesBurned = 0;
                        System.out.println("Data reset successfully.");
                    } else {
                        System.out.println("Reset canceled.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting the Fitness Tracker App. Stay healthy!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
 