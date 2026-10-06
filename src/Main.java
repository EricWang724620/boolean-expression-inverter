import java.util.Set;

public class Main {
	public static void main(String[]args) {


		Variable a = new Variable("A", true);

        System.out.println("===== Variable =====");
        System.out.println("Value: " + a.getNodeValue());
        System.out.println("Invertible: " + a.isInvertible());
        System.out.println("Variables to flip: " + a.getVariablesToFlip());

        System.out.println();


        // =========================
        // Test Constant
        // =========================

        Constant c = new Constant(false);

        System.out.println("===== Constant =====");
        System.out.println("Value: " + c.getNodeValue());
        System.out.println("Invertible: " + c.isInvertible());
        System.out.println("Variables to flip: " + c.getVariablesToFlip());

        System.out.println();


        // =========================
        // Test Variable's setters
        // =========================

        // These should NOT be accessible here if
        // your setters are protected:
        //
        // a.setNodeValue(false);
        // a.setInvertible(false);
        // a.setVariablesToFlip(Set.of());

        System.out.println("===== Access Test =====");
        System.out.println("Variable can be read from outside.");
        System.out.println("Variable cannot be modified from outside.");

        System.out.println();


        // =========================
        // Test evaluate()
        // =========================

        System.out.println("===== Evaluate =====");
        System.out.println("A evaluates to: " + a.evaluate());
        System.out.println("Constant evaluates to: " + c.evaluate());
	}
}
