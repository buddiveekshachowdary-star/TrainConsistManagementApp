import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC7) ===");

        // Step 1: Create List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies by capacity (ascending)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("\n=== Bogies Sorted by Capacity (Ascending) ===");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}