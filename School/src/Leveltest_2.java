import java.util.Scanner;

public class Leveltest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int Try=0; //�õ� Ƚ��
		int randomvalue=0; //���� ����
		int six=0; //6�� ���� Ƚ��

		System.out.println("N�� -100~100������ ������ �߻�.�̶� 6�� ���� Ȯ�� ���ϱ�");
		System.out.println("���� �߻� Ƚ��<n>�� �Է��Ͻÿ�: ");
		int n=scan.nextInt();

		for (int i=0; i<n; i++)
		{Try++;
		randomvalue=(int)(Math.random()*201)-100;
		if (randomvalue==6)
		{ 
			six++; 
		}
		}

		if (six==0)
		{
			while(randomvalue!=6)
			{Try++;
			randomvalue=(int)(Math.random()*201)-100;
			}
			six++;
		}


		System.out.println(Try+"�� �õ�, 6�� ���� Ƚ��: " + six);
		System.out.printf("Ȯ���� "+ "%.4f",(double)six/Try);
	}

}
