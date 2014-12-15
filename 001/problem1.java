/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: http://projecteuler.net/overview=001
*/

public class problem1 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 999; i > 0; i--) {
			if (i % 5 == 0 || i % 3 == 0) total = total + i;
		}
		System.out.println(total);
	}
}
