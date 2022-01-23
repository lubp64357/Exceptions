package blatt10;

public class SysTextFile extends SysObjectBase{
	String type;
	String text;
	
	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int length() {
		if(this.text == null) {
			return 0;
		} else {
			return this.text.length();
		}
	}
	@Override
	public String toString() {
		return String.format( "%s, Type =%s, Lenght = %d", super.toString(), this.type, this.length() );
	}
	
	public static void main(String[] args) {
		SysTextFile stf = new SysTextFile("Hello", "java");
		stf.setText("public class HelloWorld{/*...*/}");
		System.out.printf("%s:\n %s\n\n", stf, stf.getText() );
		}
	
	

}
