package test1;

import java.util.Scanner;
/*�������������������������������*/
public class QiuNianShu {

	public static void main(String[] args) {
		//���������
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		//���峤���η�����
		long minutes = input.nextLong();
		//��������������
		int years = (int) ((minutes / 60 / 24) / 365);
		int days = (int) ((minutes / 60 / 24) % 365);
		System.out.println(minutes + "minutes is approximately " + years + " years " + days + " days");
	}

}
