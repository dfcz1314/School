import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		do
		{
			System.out.println("������ �Է��ϼ���: <���� 1, ���� 2>: ");
			n=sc.nextInt(); //�����Է� 1 or 2
		}
		while(n !=1 && n !=2);

		System.out.println("ü���� �Է��ϼ���: ");
		int weight=sc.nextInt();

		if (n==1)
		{
			if(weight>=85)
			{
				System.out.println("��ü�� �Դϴ� ��ϼ���");
			}
			else if(weight<85 && weight>=50)
			{
				System.out.println("ǥ��ü�� �Դϴ� �� ���̽� �����ϼ���");
			}
			else
			{
				System.out.println("ǥ��ü�� ���� �Դϴ� ��� �弼��");
			}
		}
		else 
		{
			if(weight>=68)
			{
				System.out.println("��ü�� �Դϴ� ��ϼ���");
			}
			else if(weight<68 && weight>=50)
			{
				System.out.println("ǥ��ü�� �Դϴ� �� ���̽� �����ϼ���");
			}
			else
			{
				System.out.println("ǥ��ü�� ���� �Դϴ� ��� �弼��");
			}

		}
	}
}
