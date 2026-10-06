
public class Xor extends BinaryOperation{
	public Xor(BooleanNode left, BooleanNode right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public boolean evaluate() {
        boolean result = (left.evaluate() != right.evaluate());
        setNodeValue(result);
        return result;
    }

}
