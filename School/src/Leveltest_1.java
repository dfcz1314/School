import java.util.Scanner;

public class Leveltest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=0;
		int sum=0;
		int value=0;
		do
		{System.out.println("1~N���� 7�� ����� ���ϱ�");
		System.out.println("��� N ���� �Է��Ͻÿ�: ");
		n=scan.nextInt();
		}
		while (n<1);

		for (int i=1; i-1<n/7; i++)
		{sum+=i*7;
		if(sum>100 && value==0)
		{
			value=i;

		}
		}
		
		System.out.println("0~"+n+"���� 7�� ��� ����: "+sum);
		if(sum>=100)
			System.out.println("������ ���� ���� ó������ 100�� �ѱ�� 7�� ����� "+ 7*value);
	}

}
