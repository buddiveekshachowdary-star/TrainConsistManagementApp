import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashMap to store bogie -> capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management App (UC6) ===");

        // Step 1: Add bogie-capacity mapping
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100); // load capacity example

        // Step 2: Display bogie capacities
        System.out.println("\n=== Bogie Capacity Details ===");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " → Capacity: " + capacity);
        }
    }
}