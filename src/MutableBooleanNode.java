import java.util.Set;

public abstract class MutableBooleanNode extends BooleanNode{
	// stores the boolean value of the current node
	// the value can represent a single variable's boolean variable, a fixed boolean input, 
	// or a result of a sequence of boolean operations on multiple boolean variable and/or fixed inputs
	private boolean nodeValue;
	
	// if there exist any change of the boolean variable inside this node can change result of current node
	private boolean invertible;
	
	// the Set of variables inside this node that can flip and flip all of them will cause inversion of current node result
	private Set<Variable> variablesToFlip;

    @Override
    public boolean getNodeValue() {
        return nodeValue;
    }

    protected void setNodeValue(boolean value) {
        nodeValue = value;
    }
    @Override
	public boolean isInvertible() {
		// TODO Auto-generated method stub
		return this.invertible;
	}
	@Override
	public Set<Variable> getVariablesToFlip() {
		// TODO Auto-generated method stub
		return this.variablesToFlip;
	}
	protected void setInvertible(boolean value) {
		this.invertible=value;
	}
    protected void setVariablesToFlip(Set<Variable> variables) {
        this.variablesToFlip = variables;
    }
}
