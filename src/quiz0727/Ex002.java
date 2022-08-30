package quiz0727;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};   // 배열 arr에 담긴 모든값을 더하는 프로그램 완성
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			
					sum += arr[i];
		}
		System.out.println("점수의 총합:"+sum);
		
		

	}

}
