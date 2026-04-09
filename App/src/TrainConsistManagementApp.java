import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashSet to store unique bogie IDs
        Set<String> bogieSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App (UC3) ===");
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input bogie IDs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String bogieId = scanner.nextLine();

            boolean added = bogieSet.add(bogieId);

            if (!added) {
                System.out.println("Duplicate ID detected! Ignored: " + bogieId);
            }
        }

        // Display unique bogie IDs
        System.out.println("\n=== Unique Bogie IDs in Train ===");
        for (String id : bogieSet) {
            System.out.println(id);
        }

        scanner.close();
    }
}