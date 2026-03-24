import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("   STUDENT REGISTRATION STATUS CHECKER");
        System.out.println("=============================================");

        System.out.print("\nEnter student name: ");
        String name = scanner.nextLine().trim();

        int units = 0;
        while (true) {
            System.out.print("Enter number of registered units: ");
            try {
                units = Integer.parseInt(scanner.nextLine().trim());
                if (units < 0) {
                    System.out.println("Units cannot be negative. Please try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }

        String status = (units > 7) ? "Overload - Approval Required" : "Registration Accepted";

        System.out.println("\n=============================================");
        System.out.println("           REGISTRATION SUMMARY");
        System.out.println("=============================================");
        System.out.printf("  Student Name : %s%n", name);
        System.out.printf("  Units        : %d%n", units);
        System.out.printf("  Status       : %s%n", status);
        System.out.println("=============================================");

        scanner.close();
    }
}
