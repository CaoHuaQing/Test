package test1;

import java.util.Scanner;
/*输入分钟数计算它代表多少年零多少天*/
public class QiuNianShu {

	public static void main(String[] args) {
		//输入分钟数
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		//定义长整形分钟数
		long minutes = input.nextLong();
		//计算年数和天数
		int years = (int) ((minutes / 60 / 24) / 365);
		int days = (int) ((minutes / 60 / 24) % 365);
		System.out.println(minutes + "minutes is approximately " + years + " years " + days + " days");
	}

}
