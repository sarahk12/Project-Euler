/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://projecteuler.net/problem=8
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class problem22 {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			
			while ((line = infile.readLine()) != null) {
				line = line.replaceAll("\"", "");
				String[] wordsStrings = line.split(",");
				ArrayList<String> words = new ArrayList<String>(Arrays.asList(wordsStrings));
				Collections.sort(words);
				long total = 0;
				
				for (int i = 0; i < words.size(); i++) {
					long tempTotal = 0;
					String temp = words.get(i);
					for (int j = 0; j < temp.length(); j++) {
						if (Character.getNumericValue(temp.charAt(j)) > 0) { 
							tempTotal = tempTotal + (Character.getNumericValue(temp.charAt(j)) - 9);
						}
					}
					total = total + (tempTotal * (i + 1));
				}
				System.out.println(total);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
