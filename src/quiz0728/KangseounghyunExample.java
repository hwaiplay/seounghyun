package quiz0728;

public class KangseounghyunExample {
	public static void main(String[] args) {
		
		Kangseunghyun impormation = new Kangseunghyun();
		
		System.out.println("이름 : " +impormation.name);
		System.out.println("성별 : "+impormation.gender);
		System.out.println("거주지 : "+impormation.hometown);
		System.out.println("키 : "+impormation.height);
		
		impormation.weight =74.2;
		
		System.out.println("몸무게 : "+impormation.weight);
	}

}
