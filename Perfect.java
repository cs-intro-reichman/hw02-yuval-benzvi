/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 1; 
		String result = n + " is a perfect number since " + n + " = 1";
		// runs on all possible divisors of n
		for (int i = 2; i <= (n/2); i++) {
			// determines divisors and concatenates + sums accordingly
			if (n % i == 0) {
				result = result + " + " + i;
				sum = sum + i;
			}
		}
		// checks if the sum of the divisors equals the number 
		if (n == sum) {
			System.out.println(result);
		} else {
			System.out.println(n + " is not a perfect number");
		}

	}
}
