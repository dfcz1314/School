import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=0; // 구구단 출력할건지 프로그램 종료 할건지
		int x=0; // 반복 할건지 안할건지
		while(x==0)
		{

			do
			{
				System.out.println("----------");
				System.out.println("1. 구구단 출력");
				System.out.println("2. 프로그램 종료");
				System.out.println("----------");
				n=scan.nextInt();
				if (n!=1 && n!=2)
				{
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
					continue;	
				}
			}
			while(n!=1 && n!=2);

			if(n==1)
			{

				{System.out.println("출력할 구구단의 단을 입력하세요.구구단의 단은 2~9 사이 입력");}
				int Kukudan;
				do
				{	Kukudan=scan.nextInt();
				System.out.println("2~9사이 정수를 입력해주세요");
				}
				while(Kukudan>9 || Kukudan<2);
				for(int i=1; i<10; i++)
				{
					System.out.println(Kukudan+" X "+ i + "=" + Kukudan*i);
				}
			}

			else
			{	
				x++;
				System.out.println("이용해주셔서 감사합니다.");
			}

		}
	}
}
