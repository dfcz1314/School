import java.util.Scanner;

public class J2middleTest_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=0;
		int N=0;

		//M�� �� �Է¹ޱ�
		System.out.println("M���� �Է��ϼ���");
		M=sc.nextInt();
		//N�� �� �Է¹ޱ�
		System.out.println("N���� �Է��ϼ���");
		N=sc.nextInt();

		//M�� N���� ������
		if(M<N) {
			System.out.printf("M : %d ~ N: %d���� ���� ����\n",M,N);
			for(int i=M; i<=N; i++) {
				if(i==M)	System.out.print(i);
				else System.out.print(", "+i);
			}
		}	else if(M > N)	{	System.out.printf("N: %d ~ M : %d���� ���� ����\n",N,M);
		for(int i = M ; i>=N; i--)
		{
			if(i==M)	System.out.print(i);
			else System.out.print(", "+i);
		}
		}	else	System.out.print("N, M ���� �� : " + M);

		System.out.println("\n----�����մϴ�----");

	}

}
