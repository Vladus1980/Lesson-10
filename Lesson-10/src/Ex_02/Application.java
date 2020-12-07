package Ex_02;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		String s = new String(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"
						+ " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore "
						+ "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		System.out.println(s);

		char[] text = s.toCharArray();
		char[] change = { 'a', 'A', 'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O' };

		for (int t = 0; t < text.length; t++) {
			for (int c = 0; c < change.length; c++) {

				if (text[t] == change[c]) {
					text[t] = '-';
				}
			}

		}

		System.out.println(text);

	}
	

}
