package test1;
/*���2*2���Է����飨1.13��*/
public class FangChengJie {

	public static void main(String[] args) {
			//��ֵa��b��c��d��e��f
			double a = 3.4;
			double b = 50.2;
			double c = 2.1;
			double d = 0.55;
			double e = 44.5;
			double f = 5.9;
			//������Ŀ�й�ʽ��ʽ���x��y
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x=" + x + ",y=" + y);
	}

}
