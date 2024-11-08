// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		int smallestNum = Math.min(Math.min(a, b), c);
		int largestNum = Math.max(Math.max(a, b), c);
		int middleNum = Math.max(Math.min(a,b),Math.min(Math.max(a,b),c));
		System.out.println(a + " " + b + " " + c);
		System.out.println(smallestNum + " " + middleNum + " " + largestNum);
	}
}
