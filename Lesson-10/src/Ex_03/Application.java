package Ex_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		String s = new String(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"
						+ " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore "
						+ "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		System.out.println(s);

		String [] text = s.split(" ");
		int count = 0;

		for (int i = 0; i < text.length; i++) {

			if (text[i].length() > 1) {
				count++;
			}
		}

		System.out.println(count);
	}

}