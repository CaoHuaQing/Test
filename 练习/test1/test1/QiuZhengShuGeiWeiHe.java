package test1;

import java.util.Scanner;
/*输入一个0到1000间的整数求整数各位的和*/
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
