package August5;

public class Test5Example {
	public static void main(String args[]) {
        Test5 x1 = new Test5(10);
Test5 x2 = new Test5(10);
        method(x1, x2);
        System.out.println(x1.x + ", " + x2.x);
 }
 public static void method(Test5 v1, Test5 v2) {
        v2.x = 20;
        v1=v2;
 }
}

