import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char N='A';
		char array[]=new char[52];
		for(int i=0; i<52; i++) {
			if(N == 'Z'+1) N += 6;
			array[i]=N;
			N++;
		}

		int a=1;
		int b=1;
		do {
			System.out.print("���� ���� �Է��ϼ��� : ");
			a=sc.nextInt();
			if(a>52 || a<1)
			{
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���!\n");
				continue;
			}

			System.out.print("������ �Է��ϼ��� : ");
			b=sc.nextInt();
			if(a+b>53)
			{
				System.out.println("��� �� ������ �ʰ� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
				continue;
			}
		}
		while(a>52 || a<1 || a+b>53);

		System.out.print("\n����� : ");
		for(int j=a-1; j<a+b-1; j++) {
			if(j==a+b-2)
				System.out.print(array[j]);
			else
				System.out.print(array[j] + ", ");
		}

	}

}