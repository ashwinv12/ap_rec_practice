/**************************************************************
 * 
 * 	factorial
 * 
 * 		Computes the factorial of n
 * 
 **************************************************************/

public class factorial {

	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the number to find the factorial of.
	 */
	public static void main(String[] args) {
		int n = 0;
		if (args.length < 1) {
			System.out.println("Please type a number after factorial the next time you run this program.");
			System.exit(0);

		}

		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			quit(args[0]);
		}
		if (n < 0) {
			quit(args[0]);
		}
		
		int f  = recursiveSum(n);

		// int f  = recursiveFactorial(n);
		
		System.out.println("The factorial of "+ n + " is " + f + ".");

	}
	

	/**
	 * iterativeFactorial
	 * 		iteratively computes the factorial of n
	 * 
	 * @param n - the number to find the factorial of. must be non-negative.
	 *
	 * @return	the factorial of n
	 */
	public static int iterativeFactorial(int n) {
		int answer = 1;
		for (int i = n;i>0;i--) {
			answer *=i;
		}

		return answer; 
	}
	
	/**
	 * recursiveFactorial
	 * 		recursively computes the factorial of n
	 * 
	 * @param n - the number to find the factorial of. must be non-negative.
	 *
	 * @return	the factorial of n
	 */
	private static int recursiveFactorial(int n)  {
		if (n == 1) {
			return 1;
		}
		return n * recursiveFactorial(n-1);
	}

	/**
	 * recursive Sum
	 * 		recursively computes the sum from n down to one
	 *
	 * @param n - the number to find the sum of, that must be positive
	 *
	 * @return the sum factorial of n
	 */
	private static int recursiveSum(int n) {
		if (n==1) {
			return 1;
		}
	
		return n + recursiveSum(n-1);

	}
	
	/**
	 * quit
	 * 		exit the program when user entered an invalid number
	 * 
	 * @param entry - the String the user typed at the command line
	 */
	private static void quit(String entry) {
		System.out.println("Cannot find the factorial of "+ entry + ".");
		System.exit(0);
	}

}