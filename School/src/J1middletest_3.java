import java.util.Scanner;

public class J1middletest_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int win  = 0;
		int lose = 0;
		int draw = 0;
		int con=1;
		int count=0;

		while(true) {
			int computer=(int)(Math.random()*3)+1;
			System.out.println("����(1), ����(2), ��(3)�� �Է� �ϼ���");
			int n=0;

			while(n<1 || n>3)
			{	
				n=sc.nextInt();
				if(n<1 || n>3)	System.out.println("1, 2, 3 �� ���� �� �ϳ��� �Է��ϼ���!");	
			}

			count++;
			String a=" ",b=" ";  //a�� ��ǻ�Ͱ� ���� b�� ���� ����

			if(computer==n) 
			{
				if(n == 1) a="����"; 
				else if(n == 2) a="����";
				else a="��";

				System.out.printf("\n��� : ���º� [ ��ǻ�� %s, ����� : %s",a,a);
				draw++;
			}

			else if((computer == 1 && n == 2) || (computer == 2 && n == 3) || (computer == 3 && n == 1))
			{	
				if(computer == 1 && n == 2) {
					a="����";
					b="����";
				}	else if(computer == 2 && n == 3) {
					a="����";
					b="��";
				}	else if(computer == 3 && n == 1)
				{
					a="��";
					b="����";
				}
				win++;
				System.out.printf("\n��� : �� [ ��ǻ�� %s, ����� : %s ]\n",a,b);	
			}

			else 
			{
				if(computer == 1 && n == 3) {
					a="����";
					b="��";
				}	else if(computer == 2 && n == 1) {
					a="����";
					b="����";
				}	else if(computer == 3 && n == 2)
				{
					a="��";
					b="����";
				}
				lose++;
				System.out.printf("\n��� : �� [ ��ǻ�� %s, ����� : %s ]",a,b);
			}
			System.out.printf("\n%d�� %d�� %d��\n\n",win,lose,draw);
			if(count==3) break;

			System.out.println("��� �Ͻðڽ��ϱ�? (�� : 1, �ƴϿ� 2)");
			con=sc.nextInt();
			System.out.println("\n");
			if(con==2) break;
		} 

		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
