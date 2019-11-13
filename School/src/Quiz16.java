import java.util.Arrays;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println(" 행렬 사이즈(N)을 입력 하세요");
		System.out.println("-----------------------");
		int n=sc.nextInt();

		//배열 생성
		int arrayx[]=new int[n*n];
		int arrayy[]=new int[n*n];
		int array[][]= new int[n][n];
		int array2[][]= new int[n][n];
		int arraysum[][]= new int[n][n];

		System.out.println("------------------");
		//첫번째  행렬 A 값 구하기
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

		// 두번째 형렬 B 구하기
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

		//곱한 값을 배열에 넣기
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

		//곱셉 한 배열 출력
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arraysum[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("------------------");

	}

}