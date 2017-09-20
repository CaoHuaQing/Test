package test1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*产生三位整数的彩票。程序提示用户输入一个三位整数，然后依照下面的规则判定用户是否赢得奖金。 
 * 1）如果用户输入的所有数匹配彩票的确切顺序，奖金是10000美金。 
 * 2）如果用户输入的所有数匹配彩票的所有数字，奖金是3000美金。  
 * 3）如果用户输入的其中一个数匹配彩票号码中的一个数，奖金是1000美金。
  */
public class CaiPiaoYouXi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lottery = (int) (Math.random() * 900 + 100);//随机数产生中奖号码
		System.out.println("Please enter your lottery(three digits): ");

		int guess = input.nextInt();
		int lotteryd1 = lottery % 10;//提取彩票各位数字
		int lotteryd2 = (lottery / 10) % 10;
		int lotteryd3 = lottery / 100;
		int guessd1 = guess % 10;//提取竞猜数各位数字
		int guessd2 = (guess / 10) % 10;
		int guessd3 = guess / 100;
		System.out.println("The lottery number is" + lottery);
		if (guess == lottery)//判断三种获奖情况
			System.out.println("You win $10000");
		else if ((guessd1 == lotteryd2 && guessd2 == lotteryd3 && guessd3 == lotteryd1)
				|| (guessd1 == lotteryd3 && guessd2 == lotteryd1 && guessd3 == lotteryd2))
			System.out.println("You win $3000");
		else if (guessd1 == lotteryd1 || guessd1 == lotteryd2 || guessd1 == lotteryd3 || guessd2 == lotteryd1
				|| guessd2 == lotteryd2 || guessd2 == lotteryd3 || guessd3 == lotteryd1 || guessd3 == lotteryd2
				|| guessd3 == lotteryd3)
			System.out.println("You win $1000");
		else

			System.out.println("Sorry");//未获奖

	}

}
