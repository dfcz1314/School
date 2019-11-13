import java.util.Scanner;

public class Value_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("상품총액: ");
		int total=scan.nextInt(); 	//상품총금액
		int received; 				//받은돈
		final double vat=total*0.1; //세액
		double change; 				//거스름돈

		do
		{
			System.out.println("받은돈: ");
			received=scan.nextInt(); 
			change=received-(total+vat);
			if(total+vat>received)
			{System.out.println("받은 돈이 부족합니다. 다시 입력하세요!!");}
		}
		while(total+vat>received);
		System.out.println("부가세 "+(int)vat);
		System.out.println("거스름돈 "+(int)change);
	}

}
