import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�� �Ƕ�̵��� ���̸� �Է��ϼ���: ");
		System.out.println("----------------------");	


		int height=sc.nextInt();
		char A=65;
		char a=97;
		int number=1;
		int x=height*2-1;

		for (int i = 1; i < height+1; i++) {

			for(int j=0; j<i-1; j++) //�������
			{
				System.out.print(" ");
			}

			A=65; a=97; number=1; //3��° �������� �տ� �� �ʱ�ȭ

			if(i%3==1) //1��° 4��° 7��° �� ���� �빮��
			{

				for(int z=0; z<x  ; z++)
				{ 
					System.out.print(A);
					A++;
					if(A>90)
					{
						A=65;
					}
				}
			}

			else if(i%3==2) //2��° 5��° 8��° �� ����
			{
				for(int z=0; z<x  ; z++)
				{ 
					System.out.print(number);
					number++;
					if(number>9)
					{number=0;}
				}
			}

			else //3��° 6��° 9��° �� ����
			{
				for(int z=0; z<x  ; z++)
				{ 
					System.out.print(a);
					a++;
					if(a>122)
					{a=97;}
				}
			}
			x -= 2;
			System.out.println(""); //��� ����
		}
	}
}