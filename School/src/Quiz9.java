import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char N='A';
		char array[]=new char[52];
		for(int i=0; i<52; i++) {
			if(N == 'Z'+1) N += 6;
			array[i]=N;
			N++;
		}

		int a=1;
		int b=1;
		do {
			System.out.print("시작 값을 입력하세요 : ");
			a=sc.nextInt();
			if(a>52 || a<1)
			{
				System.out.println("잘못 입력 하셨습니다. 다시 입력하세요!\n");
				continue;
			}

			System.out.print("끝값을 입력하세요 : ");
			b=sc.nextInt();
			if(a+b>53)
			{
				System.out.println("출력 값 범위를 초과 하셨습니다. 다시 입력하세요.\n");
				continue;
			}
		}
		while(a>52 || a<1 || a+b>53);

		System.out.print("\n결과값 : ");
		for(int j=a-1; j<a+b-1; j++) {
			if(j==a+b-2)
				System.out.print(array[j]);
			else
				System.out.print(array[j] + ", ");
		}

	}

}