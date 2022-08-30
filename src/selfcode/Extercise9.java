package selfcode;

public class Extercise9 {
	public static void main(String[] args)   {
		char ch = 'x';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		
		System.out.println(b);
	}
} 
