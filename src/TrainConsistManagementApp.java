import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==============================================");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Steel"));

        // Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Check Result:");
        System.out.println("Is Train Safe? : " + isSafe);

        System.out.println("\nUC12 safety validation completed...");
    }
}