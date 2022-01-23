package blatt10;

public class SysObjectBase {
	String name;
	String owner;
	
	public SysObjectBase(String name) {
		this.name = name;
		this.owner = System.getenv("USERNAME");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return String.format("Class = %s, Name = %s, Owner = %s", 
				this.getClass().getSimpleName(), this.name, this.owner);
	}
	
	public static void main(String[] args) {
		System.out.println(new SysObjectBase("ABC"));
	}
	
}
