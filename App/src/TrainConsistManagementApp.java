// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {

        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe cargo! Petroleum cannot be loaded in Rectangular bogie."
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC15) ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        // ❌ Unsafe assignment
        b1.assignCargo("Petroleum");

        // ✅ Safe assignment
        b2.assignCargo("Petroleum");

        System.out.println("Program continues safely...");
    }
}
