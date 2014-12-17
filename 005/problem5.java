/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://projecteuler.net/problem=5
*/

public class problem5 {
	public static void main(String[] args) {
		int num = 21;

		while (true) {
			for (int i = 1; i < 21; i++) {
				if (num % i > 0) break;
				else if (i == (21 - 1) && (num % i) == 0) {
					System.out.println("break at " + num);
					System.exit(0);
				}
			}
			num++;
		}
	}
}
