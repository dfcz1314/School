import java.util.Scanner;

public class J1middletest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("N���� �Է��ϼ���");
		while(n<1)
		{	
			n=sc.nextInt();
			if(n<1)	System.out.println("1�̻� ����� �Է��ϼ���");
		}

		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) System.out.println("3�� 5�� ��� : "+ i);
			else if(i%3==0) System.out.println("3�� ��� : "+i);
			else if(i%5==0) System.out.println("5�� ��� : "+i);
		}

	}

}
