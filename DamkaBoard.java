/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// loops run on rows (i) and coloumns (j) and prints the symbol * n times
		for (int i = 0; i < n; i++) {
			for (int j=0; j < (n-1); j++) {
				System.out.print("* ");
			}
			if (i % 2 == 0) { // adds beginning space for every other row until the last damka row
				System.out.print("* ");
				System.out.println();
				System.out.print(" ");
			} else {
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
