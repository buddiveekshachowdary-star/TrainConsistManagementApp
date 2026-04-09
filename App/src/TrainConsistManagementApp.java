import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Consist Management App (UC5) ===");

        // Step 1: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 2: Attempt to add duplicate
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie ignored: Sleeper");
        }

        // Step 3: Display final formation
        System.out.println("\n=== Final Train Formation (Insertion Order Preserved) ===");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}