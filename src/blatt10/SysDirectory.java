package blatt10;

public class SysDirectory extends SysObjectBase{
	public SysObjectBase[] sysObjects;
	
	public SysDirectory(String name, SysObjectBase ...sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
		}
//	public void check() {
//		for(SysObjectBase so : this.sysObjects) {
//			System.out.println(so);
//			
//		}
//		
//	}

	@Override
	public String toString() {
		return String.format("%s, NumberOfObjects= %d", super.toString(), this.sysObjects.length);
	}

	public String dirStructure(String indent) {
		String ret = "";
		indent = indent + "| - ";
		for (SysObjectBase sysObject : this.sysObjects) {
			ret = ret + indent + sysObject + "\n";
			if (sysObject instanceof SysDirectory) {
				ret = ret + ((SysDirectory) sysObject).dirStructure(indent);
			}
			
		}
		return ret;
	}
	
	public static void main(String[] args) {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);
		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
		System.out.printf("%s\n", home);  
		System.out.printf("%s\n", home.dirStructure(""));
		}
	

}
