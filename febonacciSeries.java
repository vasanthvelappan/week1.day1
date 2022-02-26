package week1.day1.assignments;

public class febonacciSeries {

	public static void main(String[] args) {

		int [] range = new int [8];
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		System.out.print(firstNum+", ");
		System.out.print(secondNum+", ");
		
		for(int i=0; i<= range.length-3; i++) {  //i<= range.length-3
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.print(sum+", ");
		}
			
	}

}
