import java.util.Scanner;

public class J1middletest_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counting=0;
		System.out.println("입력 값");
		while(counting < 1)	
		{	counting = sc.nextInt();
		if(counting < 1)	System.out.println("1이상 양수를 입력하세요");
		}
		char A='A';
		for(int i=0; i<counting; i++) {
			if(i==0)	System.out.print(A);
			else System.out.print(","+A);
			A++;
			if(A=='C' || A=='H' || A=='K' || A=='P') A++;
			if(A=='Z'+1) A='A';
		}	

	}
}