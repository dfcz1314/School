import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SIZE = 50;
		int randomValues[] = new int[MAX_SIZE];
		Scanner scn= new Scanner(System.in);
		// 1~200 사이의 정수형 난수를 발생하여 배열에 저장 : 50개
		// Math.random() 호출 시 0이상 1미만의 실수형 값 반환
		for(int i=0; i < MAX_SIZE ; i++) {
			randomValues[i] = (int)((Math.random() * 200 + 1));
			for(int z=0; z<i; z++){
				if(randomValues[z]==randomValues[i])
					i--;
			}
		}
		//발생된 난수 값 화면에 출력
		for(int j=0; j<MAX_SIZE; j++) {
			if((j+1)%7==0) 
			{
				System.out.println("\t"+randomValues[j]+"\t");

			}

			else System.out.print("\t"+randomValues[j]+"\t");

		}
		//배수 값 받을때
		int n=0;
		System.out.print("\n\n배수 값 검색 용 정수를 입력하세요(1이상 정수)");
		while(n<1)
		{
			n=scn.nextInt();
			if(n<1)
			{
				System.out.println("1이상의 정수 입력하시오");
			}
		}

		// 배수인 정수들 출력 할때 
		int a=0; //몇번 나왔는지 
		System.out.println("\n" + n + "배수 값");
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

		System.out.println("\n\n"+n+" 배수 값 갯수: "+ a);

	}

}
