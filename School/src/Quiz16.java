import java.util.Arrays;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println(" ��� ������(N)�� �Է� �ϼ���");
		System.out.println("-----------------------");
		int n=sc.nextInt();

		//�迭 ����
		int arrayx[]=new int[n*n];
		int arrayy[]=new int[n*n];
		int array[][]= new int[n][n];
		int array2[][]= new int[n][n];
		int arraysum[][]= new int[n][n];

		System.out.println("------------------");
		//ù��°  ��� A �� ���ϱ�
		for(int i=0; i<arrayx.length; i++) {
			arrayx[i]=(int)(Math.random()*101);
			for(int j=0; j<i; j++) {
				if(arrayx[i]==arrayx[j]) i--;
			}		
		}

		int a=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array[i][j]=arrayx[a];
				System.out.print(array[i][j]+"\t");
				a++;
			}
			System.out.println();
		}

		System.out.println("------------------");
		System.out.println("         X        ");
		System.out.println("------------------");

		// �ι�° ���� B ���ϱ�
		for(int i=0; i<arrayx.length; i++) {
			arrayy[i]=(int)(Math.random()*101);
			for(int j=0; j<i; j++) {
				if(arrayy[i]==arrayy[j]) i--;
			}		
		}

		int b=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array2[i][j]=arrayy[b];
				System.out.print(array2[i][j]+"\t");
				b++;
			}
			System.out.println();
		}

		//���� ���� �迭�� �ֱ�
		for(int i=0; i<n; i++) {

			for(int j=0; j<n; j++) {
				int sum=0;
				for(int x=0; x<n; x++) {
					sum = sum + (array[i][x] * array2[x][j]);
				}
				arraysum[i][j]=sum;

			}
		}
		System.out.println("------------------");
		System.out.println("         =        ");
		System.out.println("------------------");

		//���� �� �迭 ���
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arraysum[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("------------------");

	}

}