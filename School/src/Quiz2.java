import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=null; //사용자에게 입력받는 수
		int T =0; //시도 횟수
		String y= new String("q"); // 

		while(true)
		{	x=sc.nextLine(); //사용자에게 x가 될 값을 입력받는다
		if(x.equals(y)) //입력받은 것이 'q' 이면 종료
		{System.out.println("이용해주셔서 감사합니다");
		break;
		}

		int n = Integer.parseInt(x); //입력받은 값을 숫자로 변환시켜준다 

		if(n==20000) //입력받은 수가 20000 이면 종료
		{
			System.out.println("이용해주셔서 감사합니다");
			break;
		}


		if(n>0) //입력받은 수가 0보다 클때
		{
			T++;
			System.out.println(T + "번째 입력 값은 = " + x);
			if(n%2==0)
			{
				System.out.println("\t짝수 입니다.");
			}
			else
			{
				System.out.println("\t홀수 입니다.");
			}

			if(n%3==0)
			{
				System.out.println("\t3의 배수입니다.");
			}
			else if(n%7==0)
			{
				System.out.println("\t7의 배수입니다.");
			}
		}

		else //입력받은 수가 0이하 일때
		{
			System.out.println("1이상 양수를 입력해주세요");
		}
		}
	}
}
