
public class Main {
	public static void main(String[]args) {


        Variable a = new Variable("A", true);
        Variable b = new Variable("B", false);

        BooleanNode expression = new And(a, b);

        System.out.println(expression.evaluate());
	}
}
