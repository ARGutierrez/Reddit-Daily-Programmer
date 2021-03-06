/**
 * Solution by ARGutierrez
 * 3/1/2014
 */

package C149E_Disemvoweler;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Scanner;

/*
 * Disemvoweling means removing the vowels from text. (For this challenge, the letters a, e, i, o, and u 
 * are considered vowels, and the letter y is not.) The idea is to make text difficult but not 
 * impossible to read, for when somebody posts something so idiotic you want people who are reading it to get extra frustrated.
 * To make things even harder to read, we'll remove spaces too. For example, this string:
 * two drums and a cymbal fall off a cliff
 * can be disemvoweled to get:
 * twdrmsndcymblfllffclff
 * We also want to keep the vowels we removed around (in their original order), which in this case is:
 * ouaaaaoai
 */

public class Disemvoweler {

	List<Character> vowels = asList('a', 'e', 'i', 'o', 'u');
	public String keepThese = "";
	public String dumpThese = "";
	
	public void disemvowel(String input) {
		
		for(char c : input.toCharArray()) {
			if(c != ' ') {
				if(vowels.contains(c)) {
					dumpThese += c;
				} else {
					keepThese += c;
				}
			}
		}	
	}


	public static void main(String [] args) {
		Disemvoweler d = new Disemvoweler();
		Scanner scan = new Scanner(System.in); 
		d.disemvowel(scan.nextLine());
		System.out.println(d.keepThese + "\n" + d.dumpThese);
	}

}