import java.util.Scanner;

public class Leveltest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int Try=0; //시도 횟수
		int randomvalue=0; //랜덤 변수
		int six=0; //6이 나온 횟수

		System.out.println("N번 -100~100사이의 난수를 발생.이때 6이 나올 확률 구하기");
		System.out.println("난수 발생 횟수<n>을 입력하시오: ");
		int n=scan.nextInt();

		for (int i=0; i<n; i++)
		{Try++;
		randomvalue=(int)(Math.random()*201)-100;
		if (randomvalue==6)
		{ 
			six++; 
		}
		}

		if (six==0)
		{
			while(randomvalue!=6)
			{Try++;
			randomvalue=(int)(Math.random()*201)-100;
			}
			six++;
		}


		System.out.println(Try+"번 시도, 6이 나온 횟수: " + six);
		System.out.printf("확률은 "+ "%.4f",(double)six/Try);
	}

}
