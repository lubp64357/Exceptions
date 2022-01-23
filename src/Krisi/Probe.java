package Krisi;

public class Probe {
	public static void main(String[] args) {
//		char c  = 'A';
//		System.out.println(c + 0);
//		
//		c = 'a' + 1;
//		System.out.println(c);
//		for(c = 'a'; c -'a'<26; c = (char) (c+1)) {
//			System.out.println(c);
//		}
		byte b = Byte.MAX_VALUE; // 1 Byte
		short s = Short.MAX_VALUE; // 2 Bytes
		int i = Integer.MAX_VALUE; // 4 Bytes
		long l = Long.MIN_VALUE; // 8 Bytes
		// ^ Wrapper-KLASSEN, später mehr
		String fmt = "\n\nb=%17x\ns=%17x\ni=%17x\nl=%17x";
		System.out.printf(fmt,
		b, s, i, l);
		System.out.printf(fmt.replaceAll("x", "d"),
		b, s, i, l);
	}

}
