// Custom Exception Class
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for " + name + ": " + capacity
            );
        }

        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC14) ===");

        try {
            // ✅ Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // ❌ Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}