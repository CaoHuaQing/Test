package test1;

import java.util.Scanner;
/*����һ��0��1000���������������λ�ĺ�*/
public class QiuZhengShuGeiWeiHe {

	public static void main(String[] args) {
		
     Scanner input=new Scanner(System.in);
     System.out.println("Please enter a number betweeen 0 and 1000");
     int number = input.nextInt();
     int sum=0;
     while(number!=0){
	     int digit=number%10;
         number=number/10;
         sum+=digit;

    }
    System.out.println("The sum of the digits is "+sum);
	}

}
