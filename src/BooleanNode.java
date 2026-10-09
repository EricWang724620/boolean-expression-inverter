import java.util.Set;

public abstract class BooleanNode {
	
	
	// method the return the boolean value of current node
	// if node = A, return A's boolean value
	// if node = A operation B, return A evaluate() (operation rule)  B evaluate();
	public abstract boolean evaluate();
	
	
	public abstract boolean getNodeValue();

    public abstract boolean isInvertible();
    public abstract Set<Variable> getVariablesToFlip();
	
}
