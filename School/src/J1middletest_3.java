import java.util.Scanner;

public class J1middletest_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int win  = 0;
		int lose = 0;
		int draw = 0;
		int con=1;
		int count=0;

		while(true) {
			int computer=(int)(Math.random()*3)+1;
			System.out.println("가위(1), 바위(2), 보(3)를 입력 하세요");
			int n=0;

			while(n<1 || n>3)
			{	
				n=sc.nextInt();
				if(n<1 || n>3)	System.out.println("1, 2, 3 세 가지 중 하나를 입력하세요!");	
			}

			count++;
			String a=" ",b=" ";  //a는 컴퓨터가 낸거 b는 내가 낸거

			if(computer==n) 
			{
				if(n == 1) a="가위"; 
				else if(n == 2) a="바위";
				else a="보";

				System.out.printf("\n결과 : 무승부 [ 컴퓨터 %s, 사용자 : %s",a,a);
				draw++;
			}

			else if((computer == 1 && n == 2) || (computer == 2 && n == 3) || (computer == 3 && n == 1))
			{	
				if(computer == 1 && n == 2) {
					a="가위";
					b="바위";
				}	else if(computer == 2 && n == 3) {
					a="바위";
					b="보";
				}	else if(computer == 3 && n == 1)
				{
					a="보";
					b="가위";
				}
				win++;
				System.out.printf("\n결과 : 승 [ 컴퓨터 %s, 사용자 : %s ]\n",a,b);	
			}

			else 
			{
				if(computer == 1 && n == 3) {
					a="가위";
					b="보";
				}	else if(computer == 2 && n == 1) {
					a="바위";
					b="가위";
				}	else if(computer == 3 && n == 2)
				{
					a="보";
					b="바위";
				}
				lose++;
				System.out.printf("\n결과 : 패 [ 컴퓨터 %s, 사용자 : %s ]",a,b);
			}
			System.out.printf("\n%d승 %d패 %d무\n\n",win,lose,draw);
			if(count==3) break;

			System.out.println("계속 하시겠습니까? (예 : 1, 아니오 2)");
			con=sc.nextInt();
			System.out.println("\n");
			if(con==2) break;
		} 

		System.out.println("이용해주셔서 감사합니다.");
	}

}
