/**************************************************************
 * 
 * 	fibonacci
 * 
 * 		Computes the first n fibonacci numbers
 * 
 **************************************************************/

public class fibonacci {
	
	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the number of fibonacci numbers to find
	 */
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Please type a number after fibonacci the next time you run this program.");
			System.exit(0);
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println(args[0] + " is not a number.");
			System.exit(0);
		}
		if (n < 1) {
			System.out.println("The number must be greater than 0.");
			System.exit(0);
		}

		System.out.println("The " +n + "th fibonacci number is: " + recursiveFibonacci(n));
		
		iterativeFibonacci(Integer.parseInt(args[0]));
		
		// recursiveFibonacci(args[1]);
		
	}


	/**
	 * iterativeFibonacci
	 * 		iteratively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int iterativeFibonacci(int n) {
		
		int answer = 2;
		if (n == 1) {
			System.out.println(1);
		}
		if (n==2) {
			System.out.println(1);
		}
		if (n==3) {
			return 2;
		}
			
			
			int a = 1;
			int b = 1;
			int anser = 2;
			for (int i=3; i<n; i++) {
			a = b;
			b = answer;
			answer = a+b;
			
		}
		
		return answer;
		
	}

	/**
	 * recursiveFibonacci
	 * 		recursively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int recursiveFibonacci(int n) {
		if ((n==1) || (n==2)) {
			return 1;
		}

		return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);



	}






}






