import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=0; // ������ ����Ұ��� ���α׷� ���� �Ұ���
		int x=0; // �ݺ� �Ұ��� ���Ұ���
		while(x==0)
		{

			do
			{
				System.out.println("----------");
				System.out.println("1. ������ ���");
				System.out.println("2. ���α׷� ����");
				System.out.println("----------");
				n=scan.nextInt();
				if (n!=1 && n!=2)
				{
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
					continue;	
				}
			}
			while(n!=1 && n!=2);

			if(n==1)
			{

				{System.out.println("����� �������� ���� �Է��ϼ���.�������� ���� 2~9 ���� �Է�");}
				int Kukudan;
				do
				{	Kukudan=scan.nextInt();
				System.out.println("2~9���� ������ �Է����ּ���");
				}
				while(Kukudan>9 || Kukudan<2);
				for(int i=1; i<10; i++)
				{
					System.out.println(Kukudan+" X "+ i + "=" + Kukudan*i);
				}
			}

			else
			{	
				x++;
				System.out.println("�̿����ּż� �����մϴ�.");
			}

		}
	}
}
