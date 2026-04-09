import java.util.*;
import java.util.stream.Collectors;

// Bogie class with category
class Bogie {
    String name;
    int capacity;
    String type; // Passenger or Goods

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC9) ===");

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72, "Passenger"));
        bogieList.add(new Bogie("AC Chair", 54, "Passenger"));
        bogieList.add(new Bogie("First Class", 24, "Passenger"));
        bogieList.add(new Bogie("Cargo", 100, "Goods"));
        bogieList.add(new Bogie("Oil Tanker", 120, "Goods"));

        // Step 2: Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Step 3: Display grouped result
        System.out.println("\n=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Bogies:");

            for (Bogie b : entry.getValue()) {
                b.display();
            }
        }
    }
}