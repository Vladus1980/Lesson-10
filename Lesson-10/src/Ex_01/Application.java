package Ex_01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("������ ����� � 5 ���� , ��� ��������� �� ���� � ����������: ");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();

		if (s.length() == 5) {
			if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3))) {
				System.out.println(s + " - ����� ��˲�����");
			} else {
				System.out.println(s + " - ����� �� ��˲�����");
			}
		} else {
			System.out.println("������� �������, �� ����� ����� �� � 5 ����!");
		}

	}

}
//1 �������� ��������, ��� ���� ���������, �� � ����� � �'��� ����, ������� ������������,
//
//���������� (��������: ������, ������). ���� ������� ����� �� � 5 ����, ��
//
//���������� ��� �������. �������� ������� ��������� ��������� �����, ����� ���� �
//
//����� ���������� ������� ������ �������. ���������, ����� ������ ��� �����л ���
//
//����� ������� �����������.