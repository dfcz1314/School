import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int[] array2=new int[10];

		//입력값 받기 (10개)
		for(int i=0; i<10; i++) {
			int n=sc.nextInt();
			array[i]=n;
			//n의 값이 기준에 부합하면 에러 메세지 후 재입력 받도록
			if(n<1 | n>9) {
				i--;
				System.out.println("1~9까지 정수 입력하시오");
			}
		}

		//입력값 모두 출력
		System.out.print("입력 값 : ");
		for(int i=0; i<9; i++) {
			System.out.print(array[i]+",");	
		}

		System.out.println(array[9]+"\n");
		System.out.println("입력 빈도");

		//입력 빈도 출력
		int number=1; // 1) 2) 3) 4)
		for(int i=1; i<=9; i++) {
			int frequency=0; // 입력빈도 

			//입력받은 값들을 i(1~9)까지 비교 후 입력빈도 상승
			for(int j=0; j<=9; j++) {
				if(i==array[j])
					frequency++;
			}

			if(frequency>0 ) {	
				System.out.println(number+") " + i + " : "+ frequency + "회");
				number++;
				array2[i-1]=frequency;
			}
		}

		System.out.println("\n히스토그램");
		//히스토그램 출력
		int jul=10;//줄 수

		for(int i=1; i<=10; i++){
			//
			if(jul==2 || jul==4 || jul==6 || jul==8)
				System.out.print("\t" + jul + "\t|");
			else 
				System.out.print("\t\t|");

			//입력 빈도에 비례하여 $ 출력하기
			for(int j=0; j<=9; j++) {
				if(array2[j]>=jul)
				{
					System.out.print("\t$");
				}
				else 
				{
					System.out.print("\t");
				}
			}

			System.out.println();
			jul -= 1;
		}
		//밑에서 두줄 생성
		System.out.println("\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-");
		System.out.println("\t\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\t");

	}

}