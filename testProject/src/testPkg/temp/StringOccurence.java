package testPkg.temp;

import java.util.HashMap;

public class StringOccurence {

	public void countOccurance(String str) {

		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();

		for (char ch : charArray) {

			if (hMap.containsKey(ch)) {
				hMap.put(ch, hMap.get(ch) + 1);
			}

			else {
				hMap.put(ch, 1);
			}
		}

		System.out.println(hMap);
	}

	public static void main(String args[]) {
		StringOccurence strOcc = new StringOccurence();
		strOcc.countOccurance("aabbbcccddddddd");
	}
}
