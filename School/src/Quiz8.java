import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SIZE = 50;
		int randomValues[] = new int[MAX_SIZE];
		Scanner scn= new Scanner(System.in);
		// 1~200 ������ ������ ������ �߻��Ͽ� �迭�� ���� : 50��
		// Math.random() ȣ�� �� 0�̻� 1�̸��� �Ǽ��� �� ��ȯ
		for(int i=0; i < MAX_SIZE ; i++) {
			randomValues[i] = (int)((Math.random() * 200 + 1));
			for(int z=0; z<i; z++){
				if(randomValues[z]==randomValues[i])
					i--;
			}
		}
		//�߻��� ���� �� ȭ�鿡 ���
		for(int j=0; j<MAX_SIZE; j++) {
			if((j+1)%7==0) 
			{
				System.out.println("\t"+randomValues[j]+"\t");

			}

			else System.out.print("\t"+randomValues[j]+"\t");

		}
		//��� �� ������
		int n=0;
		System.out.print("\n\n��� �� �˻� �� ������ �Է��ϼ���(1�̻� ����)");
		while(n<1)
		{
			n=scn.nextInt();
			if(n<1)
			{
				System.out.println("1�̻��� ���� �Է��Ͻÿ�");
			}
		}

		// ����� ������ ��� �Ҷ� 
		int a=0; //��� ���Դ��� 
		System.out.println("\n" + n + "��� ��");
		for(int i=0; i<MAX_SIZE; i++) {

			if(randomValues[i]%n==0)
			{
				System.out.print("\t"+randomValues[i]);
				a++;
				if(a%5==0 && a!=0)
				{
					System.out.println();
				}
			}

		}

		System.out.println("\n\n"+n+" ��� �� ����: "+ a);

	}

}
