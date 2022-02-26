package week1.day1.assignments;

public class MyCalculator {

	public static void main(String [] args) {
		
		Calculator object1 = new Calculator();
		System.out.println(object1.add(2, 3, 4));
		System.out.print(object1.sub(5, 2));
		System.out.println(object1.mul(2, 3));
		System.out.println(object1.div(-10, 8));
	}

}
