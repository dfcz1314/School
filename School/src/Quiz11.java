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

			System.out.println("�õ�Ƚ�� : "+n);

			System.out.println("���� 3���� �Է��ϼ���~~^--^");

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
				System.out.printf("out: �ƿ� %d��\n\n", out);
			}
			n++;

			if(n==5 || out==2)
			{
				if(n==5)	System.out.println("����Ƚ�� �ʰ�");
				if(out==2) System.out.println("out 2������");
				System.out.println("�Ʊ�� ���׿�..");
				System.out.printf("\n������ : %d %d %d �Դϴ�",array[0],array[1],array[2]);
				break;
			}

			if(strike==3)
			{
				System.out.println("�̰�׿�. ����");
				break;
			}
		}

	}

}