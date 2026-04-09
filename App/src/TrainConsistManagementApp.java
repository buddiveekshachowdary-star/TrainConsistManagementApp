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
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison ===");

        // Step 1: Create large dataset
        List<Bogie> bogieList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 54));
            bogieList.add(new Bogie("First Class", 24));
        }

        // -------------------------------
        // 🔹 Loop-Based Filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // 🔹 Stream-Based Filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Results
        // -------------------------------
        System.out.println("\nLoop Filtering Time (ns): " + loopTime);
        System.out.println("Stream Filtering Time (ns): " + streamTime);

        // Optional comparison
        System.out.println("\n=== Performance Insight ===");
        if (loopTime < streamTime) {
            System.out.println("Loop is faster ⚡");
        } else {
            System.out.println("Stream is faster ⚡");
        }
    }
}