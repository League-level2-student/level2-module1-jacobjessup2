package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> letters = new ArrayList<String>();
		
		//2. Add five Strings to your list
		letters.add("Ladder");
		letters.add("Bananza");
		letters.add("Fruit");
		letters.add("Eat");
		letters.add("Stuff");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < letters.size(); i++) {
			String j = letters.get(i);
			System.out.println(j);
		}
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		for (String s : letters) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < letters.size(); i++) {
			int y = i%2;
			if(y == 0) {
			String r = letters.get(i);
			System.out.println(r);
			}
		}
		System.out.println("\n");
		
		//6. Print all the Strings in reverse order.
		for (int i = letters.size() - 1; i >= 0; i--) {
			String f = letters.get(i);
			System.out.println(f);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		CharSequence[] oof = new CharSequence[2];
		oof[0] = "e";
		oof[1] = "E";
		for (int i = 0; i < letters.size(); i++) {
			String letterE = letters.get(i);
			if(letterE.contains(oof[0]) == true || letterE.contains(oof[1]) == true) {
				System.out.println(letterE);
			}
		}
		
	
	}
}
