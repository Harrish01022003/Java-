package week2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		
		for(int i = 0;i < 10;i++) {
			thirdNumber = firstNumber + secondNumber;
			System.out.println(thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			 
		}
	}

}
