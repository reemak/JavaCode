
/*Problem Statement
Given a string, find out the lexicographically smallest and largest substring of length k.
[Note: Lexicographic order is also known as alphabetic order dictionary order.
So "ball" is smaller than "cat", "dog" is smaller than "dorm".
Capital letter always comes before smaller letter,
 so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]*/

import java.util.*;

public class StringCompare {

	public static String[] todoSubStringCompare(String a, int size) {
		TreeSet<String> tree = new TreeSet<String>();
		String[] ans = new String[2];
		int i = 0;
		while (i < (a.length() + 1 - size)) {
			String temp = "";
			for (int j = i; j < size + i; j++) {
				temp = temp + a.charAt(j);
			}
			tree.add(temp);
			// System.out.println(temp);
			i++;
		}
		ans[0] = tree.pollFirst();
		ans[1] = tree.pollLast();
		return ans;
	}

	public static void main(String[] args) {
		//String in = "welcomeToJava";
		//int size = 3;
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		int size=sc.nextInt();
		String[] out = todoSubStringCompare(in, size);
		System.out.println(out[0]);
		System.out.println(out[1]);
	}

}
