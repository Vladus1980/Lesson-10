package Ex_01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Введіть слово з 5 букв , щоб перевірити чи воно є паліндромом: ");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();

		if (s.length() == 5) {
			if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3))) {
				System.out.println(s + " - слово ПАЛІНДРОМ");
			} else {
				System.out.println(s + " - слово не ПАЛІНДРОМ");
			}
		} else {
			System.out.println("Сталась помилка, Ви ввели слово не з 5 букв!");
		}

	}

}
//1 Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем,
//
//паліндромом (приклади: «пилип», «ротор»). Якщо введено слово не з 5 букв, то
//
//повідомляти про помилку. Програма повинна нормально обробляти слово, навіть якщо в
//
//ньому використані символи різного регістру. Наприклад, слова «Комок» або «РОТОР» слід
//
//також вважати паліндромами.