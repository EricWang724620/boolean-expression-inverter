
public class Variable extends BooleanNode{
	private String name;
	public Variable(String name, boolean value) {
		this.name=name;
		setNodeValue(value);
		//System.out.println("there"+value);

	}
	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return getNodeValue();
	}

}
