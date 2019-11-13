import java.util.Scanner;

public class J1middletest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("N값을 입력하세요");
		while(n<1)
		{	
			n=sc.nextInt();
			if(n<1)	System.out.println("1이상 양수를 입력하세요");
		}

		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) System.out.println("3과 5의 배수 : "+ i);
			else if(i%3==0) System.out.println("3의 배수 : "+i);
			else if(i%5==0) System.out.println("5의 배수 : "+i);
		}

	}

}
