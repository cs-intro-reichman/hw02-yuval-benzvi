/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reversed = "";
		int length = word.length();
		char middle = word.charAt((length-1)/2);
		for (int i = 0; i < length; i++) {
			reversed = reversed + word.charAt(length-1-i);
		}
		System.out.println(reversed);
		System.out.println("The middle character is " + middle);
	}
}
