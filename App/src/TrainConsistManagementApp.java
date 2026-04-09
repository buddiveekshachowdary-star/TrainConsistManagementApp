import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedList to maintain ordered consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== Train Consist Management App (UC4) ===");

        // Step 1: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 2: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // Step 3: Remove first and last bogie
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        // Step 4: Display final ordered consist
        System.out.println("\n=== Final Train Consist ===");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}