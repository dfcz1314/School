import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("역 피라미드의 높이를 입력하세요: ");
		System.out.println("----------------------");	


		int height=sc.nextInt();
		char A=65;
		char a=97;
		int number=1;
		int x=height*2-1;

		for (int i = 1; i < height+1; i++) {

			for(int j=0; j<i-1; j++) //띄워쓰기
			{
				System.out.print(" ");
			}

			A=65; a=97; number=1; //3번째 돌때마다 앞에 값 초기화

			if(i%3==1) //1번째 4번째 7번째 때 실행 대문자
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

			else if(i%3==2) //2번째 5번째 8번째 때 실행
			{
				for(int z=0; z<x  ; z++)
				{ 
					System.out.print(number);
					number++;
					if(number>9)
					{number=0;}
				}
			}

			else //3번째 6번째 9번째 때 실행
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
			System.out.println(""); //띄워 쓰기
		}
	}
}