import java.util.Scanner;

public class Value_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("��ռӵ��� �Է��ϼ���! <km/h>");
		double average=scan.nextInt();
		System.out.println("����Ÿ� �Է��ϼ���! <km/h>");
		double distance=scan.nextInt();
		double time=distance/average;
		System.out.printf("����ð�: "+ "%.4f%n",time);
	}

}
