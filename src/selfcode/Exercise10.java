package selfcode;

public class Exercise10 {
	public static void main(String[] args) {
		char ch = 'c';
		char higherCase = ('a' <= ch && ch <= 'z') ? (char)(ch-32): ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to higherCase:"+higherCase);

}
}
