import java.util.Arrays;
import java.util.Scanner;

public class J2middleTest_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 

		int N=0; //�迭�� ũ�� �ʱ�ȭ
		System.out.println("�迭�� ������ �Է��ϼ���.");

		while(N<1 || N>100) //N�� 1~100 �ȿ� ����� �˻� �ƴϸ� ���� ���� ����� �� �Է¹ޤ���
		{
			N=sc.nextInt();
			if(N<1 || N>100)	System.out.println("1 �̻��� ���� �Է��ϼ���");
		}

		int array[]=new int[N]; //�迭 ����

		//�迭�ȿ� ������ �ֱ�
		for(int i=0; i<N; i++) {
			int randomvalue=(int)(Math.random()*(101))-50;
			array[i]=randomvalue;
			//�ߺ��� �ִ��� ������ �˻�
			for(int j=0; j<i; j++) {
				if(array[j]==randomvalue) i--;
			}
		}


		System.out.println("\n�迭��    ����   : " + N);
		System.out.print("�迭 �� ���� �� : ");

		//�迭 ���� �� ���
		for(int i=0; i<N; i++){
			if(i==0)	System.out.print(array[i]); //ù��°�� ��ǥ �����
			else System.out.print(","+array[i]); //ù��°�� �ƴҶ� ��ǥ ���
		}

		int sum=0; // �迭���� ������ ����
		for(int i=0; i<N; i++) {
			sum += array[i];
		}

		Arrays.sort(array); //�迭 ũ������� ����

		System.out.println("\n��     ��      �� : " + array[N-1]);
		System.out.println("��     ��      �� : " + array[0]);
		System.out.println("��     ��      �� : " + ((float)sum/N));

		int array2[]=new int[10]; // ���� ������ � ������ �����ϴ� �迭


		for(int i=0; i<N; i++) {
			if(array[i]<-40)		array2[0]++;
			else if(array[i] < -30)	array2[1]++;
			else if(array[i] < -20)	array2[2]++;
			else if(array[i] < -10)	array2[3]++;
			else if(array[i] < 0)	array2[4]++;
			else if(array[i] < 10)	array2[5]++;
			else if(array[i] < 20)	array2[6]++;
			else if(array[i] < 30)	array2[7]++;
			else if(array[i] < 40)	array2[8]++;
			else					array2[9]++;
		}

		System.out.println("\n������׷�");
		int a=-50;
		int b=-41;

		//������׷� ���
		for(int i=0; i<10; i++) {
			if(i==4) System.out.print(" ");
			if(i==5) System.out.print("    ");
			if(i>5) System.out.print("  ");
			System.out.print("  " + a + " ~ " + b +" : ");

			for(int j=0; j<array2[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
			a+=10;
			b+=10;
		}

	}

}
