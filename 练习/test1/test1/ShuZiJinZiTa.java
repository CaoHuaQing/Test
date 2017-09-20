package test1;

import java.util.Scanner;

/*编写程序输入一个整数，显示一个数字金字塔，输0则结束程序*/
public class ShuZiJinZiTa {

	public static void main(String[] args) {
		//输入一个整数
		 Scanner input=new Scanner(System.in);
         System.out.println("Enter the number of line");
       int a=1;
         do{
          a =input.nextInt();
          for(int i=1; i<=a; i++) {//利用嵌套循环打印金字塔
             for(int j=(a-i)*3-1; j>=0; j--) {//打印空格
                 System.out.print(" ");
             }
             for(int j=i; j>=1; j--) {//打印递减的前半部分
                 if(j<10)//大于等于10为两位数，间隔一个空格，个位数间隔两个空格
                     System.out.print("  ");
                 else 
                     System.out.print(" ");
                 System.out.print(j);
             }
             for(int j=2; j<=i; j++) {//打印递增的后半部分
                 if(j<10)
                     System.out.print("  ");
                 else 
                     System.out.print(" ");
                 System.out.print(j);
             }
             System.out.println("");		
         }
         }while(a!=0);  //输入值0为程序结束符
         System.out.println("您已输入0，程序结束");
	}

}
