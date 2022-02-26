package week1.day1.assignments;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=123;
		int quotient = 1;
		int reminder = 0;
		int sum=0;
		
		while (quotient>0) {
			quotient = input/10;
			reminder = input%10;
			input = quotient;
			sum+=reminder;
			
		}
			System.out.println("sum of digit is : "+sum);	
	}

}
