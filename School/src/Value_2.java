import java.util.Scanner;

public class Value_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("��------------------------��");
		System.out.println("  3x^5+7x+11 ���׽İ�����α׷�");
		System.out.println("��------------------------��");
		System.out.println("x ���� �Է��Ͻÿ�!!");
		double x=scan.nextInt();
		double result=3*Math.pow(x, 5)+(7*x)+11;
		System.out.println("����ð�: " + (int)result );
	}

}
