import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // e.g., Coal, Petroleum

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    void display() {
        System.out.println(type + " → Cargo: " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC12) ===");

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogieList = new ArrayList<>();
        bogieList.add(new GoodsBogie("Rectangular", "Coal"));
        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("Rectangular", "Grain"));

        // ❌ Try invalid case:
        // bogieList.add(new GoodsBogie("Cylindrical", "Water"));

        // Step 2: Apply safety rule using allMatch()
        boolean isSafe = bogieList.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum allowed
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Step 3: Display bogies
        System.out.println("\n=== Goods Bogies ===");
        for (GoodsBogie b : bogieList) {
            b.display();
        }

        // Step 4: Display safety result
        System.out.println("\n=== Safety Status ===");
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}