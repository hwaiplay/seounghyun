package quiz0728;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}

}
class Student  {
	String name;
	int ban;
	int no;
	int kor;
	int math;
	int eng;
	


  Student(String name,int ban, int no, int kor, int math, int eng) {
	 this.name = name;
	 this.ban = ban;
	 this.no = no;
	 this.kor = kor;
	 this.math = math;
	 this.eng = eng;
}

 int getTotal()  {
	 return kor+math+eng;
	 }
 
float getAverage() {
	return (int)(getTotal()/3f*10+0.5f)/10;
}

   public String info()   {
	   return name +","+ban +","+no +","+kor +","+math +","+eng+","+getTotal() +","+getAverage();
			   
			   
	   
   }
   }


 