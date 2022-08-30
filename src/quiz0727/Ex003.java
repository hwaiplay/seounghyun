package quiz0727;     //모든 값의 총합과 평균을 구하라

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {                
				{5,5,5,5,5,},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				
		};
		
		int total = 0;
		double average = 0;
		
		for(int i=0;i<arr.length;i++)    {
			for(int j=0;j<arr[i].length;j++)  {
				total += arr[i][j];
				
				
				
			}
			
		}
		average =  total/(double)(arr.length*arr[0].length);	
		System.out.println("모든 값의 총합:"+total);
		System.out.println("모든 값의 평균:"+average);
		
		}

	}


