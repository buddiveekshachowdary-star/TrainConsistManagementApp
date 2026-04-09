import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC8) ===");

        // Step 1: Create list (same as UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury", 80)); // extra for testing

        // Step 2: Filter bogies with capacity > 60
        List<Bogie> filteredList = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\n=== Bogies with Capacity > 60 ===");
        for (Bogie b : filteredList) {
            b.display();
        }

        // Step 4: Show original list is unchanged
        System.out.println("\n=== Original Bogie List (Unchanged) ===");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}