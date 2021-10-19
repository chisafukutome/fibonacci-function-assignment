/*
 * Created by: Chisa Fukutome
 * Date created: 10/19/2021
 * Purpose: To compare the runtime efficiency between a recursive and iterative fashion
 */
public class Fibonacci {

	public static void main(String[] args) {
		//runtime efficiency
		long startTime, endTime, timeTook;
		
		//assign "nth"
		long nth = 10;
		
		//recursive operation
		System.out.println("[Recursive]");
		startTime = System.nanoTime();	//count the start time
		System.out.println(nth + "th term: " + fibonacciRec(nth));
		endTime = System.nanoTime();	//count the end time
		timeTook = endTime - startTime;
		System.out.println("It took " + timeTook + " nanosecond\n");
		
		//iterative operation
		System.out.println("[Iterative]");
		startTime = System.nanoTime();	//count the start time
		System.out.println(nth + "th term: " + fibonacciItr(nth));
		endTime = System.nanoTime();	//count the end time
		timeTook = endTime - startTime;
		System.out.println("It took " + timeTook + " nanosecond");



	}//end main method
	
	public static long fibonacciRec(long nth) {
		if(nth == 0 || nth == 1) {
			//fibonacci sequence "1, 1, 2, 3...", so the 1st and 2nd values are the same as nth.
			return nth;
		}
		
		//call its own method (recursion)
		return fibonacciRec(nth - 2) + fibonacciRec(nth - 1);
	}//end fibonacciRec (recursive)
	
	public static long fibonacciItr(long nth) {
		//variable declarations
		long firstNum = 1, secondNum = 0, result = 0;
		
		if(nth == 0 || nth == 1) {
			//fibonacci sequence "1, 1, 2, 3...", so the 1st and 2nd values are the same as nth.
			return nth;
		} else {
			for(int i = 0; i < nth; i++) {
				result = firstNum + secondNum;
				firstNum = secondNum;
				secondNum = result;
			}//loop all the way until nth value
		}
		return result;
	}//end fibonacciItr (iterative)

}//end Fibonacci Class
