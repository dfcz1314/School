import java.util.Scanner;

public class J2middleTest_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=0;
		int N=0;

		//M의 값 입력받기
		System.out.println("M값을 입력하세요");
		M=sc.nextInt();
		//N의 값 입력받기
		System.out.println("N값을 입력하세요");
		N=sc.nextInt();

		//M이 N보다 작을때
		if(M<N) {
			System.out.printf("M : %d ~ N: %d사이 정수 값은\n",M,N);
			for(int i=M; i<=N; i++) {
				if(i==M)	System.out.print(i);
				else System.out.print(", "+i);
			}
		}	else if(M > N)	{	System.out.printf("N: %d ~ M : %d사이 정수 값은\n",N,M);
		for(int i = M ; i>=N; i--)
		{
			if(i==M)	System.out.print(i);
			else System.out.print(", "+i);
		}
		}	else	System.out.print("N, M 정수 값 : " + M);

		System.out.println("\n----감사합니다----");

	}

}
