import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int value=0;

		if(a==b && b==c) //같은 눈 3개 나올때
		{
			System.out.println(10000+a*1000);
		}

		else if(a==b || b==c || c==a) //같은눈 두개 나올때
		{
			if(a==b || a==c) System.out.println(1000+a*100);
			else System.out.println(1000+b*100);
		}
		//같은 눈이 하나도 없을 경우
		else {
			for(int i=6; i>0; i--)
			{
				if(a>=i) 
				{
					System.out.println(a*100);
					break;
				}
				if(b>=i) 
				{
					System.out.println(b*100);
					break;
				}
				if(c>=i)
				{
					System.out.println(c*100);
					break;
				}
			}
		}
	}

}

