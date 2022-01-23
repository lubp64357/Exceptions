package blatt10;

public class IntegerValueObject {
	
	private int i;
	
	public IntegerValueObject(int i) {
		this.i = i;
	}
	
	public IntegerValueObject add(int j) {
		return new IntegerValueObject(this.i +j);
	}
	
	public IntegerValueObject mul(int j) {
		return new IntegerValueObject(this.i * j);
	}
	@Override
	public String toString() {
		return Integer.toString(this.i);
	}
	public static void main(String[] args) {
		System.out.println( new IntegerValueObject(2).mul(3).add(4).mul(5) );
	}

}
