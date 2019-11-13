import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int array[]=new int[3];

		for(int i=0; i<3; i++) {
			array[i]=(int)(Math.random()*9);

			for(int j=0; j<i; j++) {
				if(array[i]==array[j])
				{
					i--;
					continue;
				}
			}

		}

		int n=1;
		int out=0;

		int array2[]=new int[3];

		while(n<5 || out<2) {
			int strike=0;
			int ball=0;

			System.out.println("시도횟수 : "+n);

			System.out.println("정수 3개를 입력하세용~~^--^");

			for(int i=0; i<3; i++) {
				array2[i]=sc.nextInt();
			}

			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++)
					if(array[i]==array2[j] && i==j) strike++;
					else if(array[i]==array2[j]) ball++;
			}

			if(strike==1 || strike==2)	System.out.print("\n"+strike+" Strike ");
			if(ball>0)	System.out.print(ball+" ball \n\n");
			if(strike==0 && ball==0) 
			{
				out++;
				System.out.printf("out: 아웃 %d번\n\n", out);
			}
			n++;

			if(n==5 || out==2)
			{
				if(n==5)	System.out.println("게임횟수 초과");
				if(out==2) System.out.println("out 2개에요");
				System.out.println("아까비 졌네요..");
				System.out.printf("\n정답은 : %d %d %d 입니다",array[0],array[1],array[2]);
				break;
			}

			if(strike==3)
			{
				System.out.println("이겼네요. ㅎㅎ");
				break;
			}
		}

	}

}