/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://projecteuler.net/problem=6
*/

public class problem6 {
	public static void main(String[] args) {
		int part1 = 0, part2 = 0, total = 0;
		for (int i = 1; i < 101; i++) {
			part1 = part1 + (i * i);
		}
		for (int i = 1; i < 101; i++) {
			part2 = part2 + i;
		}
		total = (part2 * part2) - part1;
		System.out.println(total);
	}
}
