import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==============================================");

        // Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        trainFormation.add("Sleeper"); // ignored

        // Display output
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Note section (important for matching output)
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}