import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int[] array2=new int[10];

		//�Է°� �ޱ� (10��)
		for(int i=0; i<10; i++) {
			int n=sc.nextInt();
			array[i]=n;
			//n�� ���� ���ؿ� �����ϸ� ���� �޼��� �� ���Է� �޵���
			if(n<1 | n>9) {
				i--;
				System.out.println("1~9���� ���� �Է��Ͻÿ�");
			}
		}

		//�Է°� ��� ���
		System.out.print("�Է� �� : ");
		for(int i=0; i<9; i++) {
			System.out.print(array[i]+",");	
		}

		System.out.println(array[9]+"\n");
		System.out.println("�Է� ��");

		//�Է� �� ���
		int number=1; // 1) 2) 3) 4)
		for(int i=1; i<=9; i++) {
			int frequency=0; // �Էº� 

			//�Է¹��� ������ i(1~9)���� �� �� �Էº� ���
			for(int j=0; j<=9; j++) {
				if(i==array[j])
					frequency++;
			}

			if(frequency>0 ) {	
				System.out.println(number+") " + i + " : "+ frequency + "ȸ");
				number++;
				array2[i-1]=frequency;
			}
		}

		System.out.println("\n������׷�");
		//������׷� ���
		int jul=10;//�� ��

		for(int i=1; i<=10; i++){
			//
			if(jul==2 || jul==4 || jul==6 || jul==8)
				System.out.print("\t" + jul + "\t|");
			else 
				System.out.print("\t\t|");

			//�Է� �󵵿� ����Ͽ� $ ����ϱ�
			for(int j=0; j<=9; j++) {
				if(array2[j]>=jul)
				{
					System.out.print("\t$");
				}
				else 
				{
					System.out.print("\t");
				}
			}

			System.out.println();
			jul -= 1;
		}
		//�ؿ��� ���� ����
		System.out.println("\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-");
		System.out.println("\t\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\t");

	}

}