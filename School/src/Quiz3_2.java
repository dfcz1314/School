import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		do
		{
			System.out.println("성별을 입력하세요: <남성 1, 여성 2>: ");
			n=sc.nextInt(); //성별입력 1 or 2
		}
		while(n !=1 && n !=2);

		System.out.println("체중을 입력하세요: ");
		int weight=sc.nextInt();

		if (n==1)
		{
			if(weight>=85)
			{
				System.out.println("과체중 입니다 운동하세요");
			}
			else if(weight<85 && weight>=50)
			{
				System.out.println("표준체중 입니다 현 페이스 유지하세요");
			}
			else
			{
				System.out.println("표준체중 이하 입니다 고기 드세요");
			}
		}
		else 
		{
			if(weight>=68)
			{
				System.out.println("과체중 입니다 운동하세요");
			}
			else if(weight<68 && weight>=50)
			{
				System.out.println("표준체중 입니다 현 페이스 유지하세요");
			}
			else
			{
				System.out.println("표준체중 이하 입니다 고기 드세요");
			}

		}
	}
}
