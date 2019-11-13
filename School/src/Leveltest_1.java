import java.util.Scanner;

public class Leveltest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=0;
		int sum=0;
		int value=0;
		do
		{System.out.println("1~N까지 7의 배수합 구하기");
		System.out.println("양수 N 값을 입력하시오: ");
		n=scan.nextInt();
		}
		while (n<1);

		for (int i=1; i-1<n/7; i++)
		{sum+=i*7;
		if(sum>100 && value==0)
		{
			value=i;

		}
		}
		
		System.out.println("0~"+n+"까지 7의 배수 합은: "+sum);
		if(sum>=100)
			System.out.println("누적된 합의 값이 처음으로 100을 넘기는 7의 배수는 "+ 7*value);
	}

}
