import java.util.Scanner;

public class Quiz3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0; //�ټ��ڸ� ���� �Է� ���� ��
		int sum=0;

		do
		{
			System.out.println("�ټ��ڸ� ������ �Է��Ͻÿ�");
			n=sc.nextInt();
		}
		while(n<10000 || n>99999);

		int[] array=new int[5];

		for (int i = 4; i >= 0; i--) 
		{
			array[i]=n%10;
			n /= 10;
			sum += array[i];
		}
		for (int i = 0; i<5;  i++) 
		{
			if(i<4)
			{
				System.out.print(array[i]+" + ");
			}	
			else
			{
				System.out.print(array[i]+ " = " + sum);
			}
		}

	}

}


