import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC10) ===");

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Calculate total capacity using stream
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}