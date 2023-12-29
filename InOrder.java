/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random = 0;
		int new_random = 0;
		boolean flag = true;
		do {
			new_random = (int) (Math.random()*10);
			if (new_random >= random) {
				System.out.print(new_random + " ");	
				random = new_random;
			} else {
				flag = false;
			}
		} while (flag);
		System.out.println();
	}
}
