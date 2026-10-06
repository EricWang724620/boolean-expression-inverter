import java.util.Set;

public abstract class BooleanNode {
	
	// stores the boolean value of the current node
	// the value can represent a single variable's boolean variable, a fixed boolean input, 
	// or a result of a sequence of boolean operations on multiple boolean variable and/or fixed inputs
	private boolean nodeValue;
	
	// if there exist any change of the boolean variable inside this node can change result of current node
	private boolean invertible;
	
	// the Set of variables inside this node that can flip and flip all of them will cause inversion of current node result
	private Set<Variable> variablesToFlip;
	
	// method the return the boolean value of current node
	// if node = A, return A's boolean value
	// if node = A operation B, return A evaluate() (operation rule)  B evaluate();
	public abstract boolean evaluate();
	
	
	public abstract boolean getNodeValue();

    public abstract boolean isInvertible();
    public abstract Set<Variable> getVariablesToFlip();
	
}
