package test1;

import java.util.Scanner;

/*��д��������һ����������ʾһ�����ֽ���������0���������*/
public class ShuZiJinZiTa {

	public static void main(String[] args) {
		//����һ������
		 Scanner input=new Scanner(System.in);
         System.out.println("Enter the number of line");
       int a=1;
         do{
          a =input.nextInt();
          for(int i=1; i<=a; i++) {//����Ƕ��ѭ����ӡ������
             for(int j=(a-i)*3-1; j>=0; j--) {//��ӡ�ո�
                 System.out.print(" ");
             }
             for(int j=i; j>=1; j--) {//��ӡ�ݼ���ǰ�벿��
                 if(j<10)//���ڵ���10Ϊ��λ�������һ���ո񣬸�λ����������ո�
                     System.out.print("  ");
                 else 
                     System.out.print(" ");
                 System.out.print(j);
             }
             for(int j=2; j<=i; j++) {//��ӡ�����ĺ�벿��
                 if(j<10)
                     System.out.print("  ");
                 else 
                     System.out.print(" ");
                 System.out.print(j);
             }
             System.out.println("");		
         }
         }while(a!=0);  //����ֵ0Ϊ���������
         System.out.println("��������0���������");
	}

}
