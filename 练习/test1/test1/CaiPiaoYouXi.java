package test1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*������λ�����Ĳ�Ʊ��������ʾ�û�����һ����λ������Ȼ����������Ĺ����ж��û��Ƿ�Ӯ�ý��� 
 * 1������û������������ƥ���Ʊ��ȷ��˳�򣬽�����10000���� 
 * 2������û������������ƥ���Ʊ���������֣�������3000����  
 * 3������û����������һ����ƥ���Ʊ�����е�һ������������1000����
  */
public class CaiPiaoYouXi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lottery = (int) (Math.random() * 900 + 100);//����������н�����
		System.out.println("Please enter your lottery(three digits): ");

		int guess = input.nextInt();
		int lotteryd1 = lottery % 10;//��ȡ��Ʊ��λ����
		int lotteryd2 = (lottery / 10) % 10;
		int lotteryd3 = lottery / 100;
		int guessd1 = guess % 10;//��ȡ��������λ����
		int guessd2 = (guess / 10) % 10;
		int guessd3 = guess / 100;
		System.out.println("The lottery number is" + lottery);
		if (guess == lottery)//�ж����ֻ����
			System.out.println("You win $10000");
		else if ((guessd1 == lotteryd2 && guessd2 == lotteryd3 && guessd3 == lotteryd1)
				|| (guessd1 == lotteryd3 && guessd2 == lotteryd1 && guessd3 == lotteryd2))
			System.out.println("You win $3000");
		else if (guessd1 == lotteryd1 || guessd1 == lotteryd2 || guessd1 == lotteryd3 || guessd2 == lotteryd1
				|| guessd2 == lotteryd2 || guessd2 == lotteryd3 || guessd3 == lotteryd1 || guessd3 == lotteryd2
				|| guessd3 == lotteryd3)
			System.out.println("You win $1000");
		else

			System.out.println("Sorry");//δ��

	}

}
