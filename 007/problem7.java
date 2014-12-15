import java.util.ArrayList;

/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: http://projecteuler.net/overview=007
*/

public class problem7 {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int primeCounter = 3;
		int num = 5;
		primes.add(2);
		primes.add(3);
		primes.add(5);
		while (primeCounter < 10_001) {
			num = num + 2;
			for (int i = 0; i < primes.size(); i++) {
				if (num % (primes.get(i)) == 0) break;
				else if (i == (primes.size() - 1))  {
					primes.add(num);
					primeCounter++;
					break;
				}
			}	
		}
		System.out.println(num);
	}
}
