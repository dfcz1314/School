import java.util.Arrays;
import java.util.Scanner;

public class J2middleTest_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 

		int N=0; //배열의 크기 초기화
		System.out.println("배열의 개수를 입력하세요.");

		while(N<1 || N>100) //N이 1~100 안에 드는지 검사 아니면 오류 문구 출력후 재 입력받ㄱ기
		{
			N=sc.nextInt();
			if(N<1 || N>100)	System.out.println("1 이상의 값을 입력하세요");
		}

		int array[]=new int[N]; //배열 생성

		//배열안에 랜덤값 넣기
		for(int i=0; i<N; i++) {
			int randomvalue=(int)(Math.random()*(101))-50;
			array[i]=randomvalue;
			//중복값 있는지 없는지 검사
			for(int j=0; j<i; j++) {
				if(array[j]==randomvalue) i--;
			}
		}


		System.out.println("\n배열의    개수   : " + N);
		System.out.print("배열 내 난수 값 : ");

		//배열 난수 값 출력
		for(int i=0; i<N; i++){
			if(i==0)	System.out.print(array[i]); //첫번째는 쉼표 미출력
			else System.out.print(","+array[i]); //첫번째가 아닐때 쉼표 출력
		}

		int sum=0; // 배열안의 랜덤값 총합
		for(int i=0; i<N; i++) {
			sum += array[i];
		}

		Arrays.sort(array); //배열 크기순으로 정렬

		System.out.println("\n최     대      값 : " + array[N-1]);
		System.out.println("최     소      값 : " + array[0]);
		System.out.println("평     균      값 : " + ((float)sum/N));

		int array2[]=new int[10]; // 숫자 범위에 몇개 들어가는지 저장하는 배열


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

		System.out.println("\n히스토그램");
		int a=-50;
		int b=-41;

		//히스토그램 출력
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
