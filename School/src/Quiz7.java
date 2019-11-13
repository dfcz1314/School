import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		final int MAX_SIZE = 30; // 문자열 배열의 크기
		String inputValues = null; //키보드로부터 입력 받은 문자열 저장
		System.out.println("입력 문장:"); //키보드로 부터 문자열을 입력 받아 String 형 저장\
		inputValues=scn.nextLine(); //입력문장
		//키보드로부터 입력 받은 문자열을 Char형 배열로 저장
		// 찾아/바꾸기 기능 구현시 사용
		char Array[] = new char[MAX_SIZE];

		//저장된 문자열을 Char형 array 변수 charArray에 복사
		inputValues.getChars(0, inputValues.length(), Array, 0);

		//찾을 문자열 입력 받기
		System.out.println("찾을 문자열:");
		String quest=scn.nextLine();

		char Array2[]= new char[quest.length()]; //찾을 문자열을 char 값에 저장
		quest.getChars(0, quest.length(), Array2, 0);

		//찾을 문자열이 있는지 없는지 검사
		int n=0;
		for(int i=0; i<inputValues.length(); i++) {
			//찾을 문자가 1개 일때
			if(Array2[0] == Array[i] && quest.length()==1)
				n++;

			if(Array2[0] == Array[i] && quest.length()>1)
			{	int a=0;

			for(int z=1; z<quest.length(); z++) {
				if(Array2[z] == Array[i+z])
					a++;
				if (a==quest.length()-1)
					n++;	
			}	
			}
		}


		//찾을 문자열이 있을 경우
		if(n>0) {
			System.out.println("바꿀 문자열:");
			String change=scn.nextLine();

			// 문자열 출력
			System.out.print("결과: ");
			for(int i=0; i<inputValues.length(); i++) {

				if(Array2[0] == Array[i])
				{	int a=0;
				if(quest.length()==1)
				{
					System.out.print(change);
					a++;
				}

				else
				{
					for(int z=1; z<quest.length(); z++) {
						if(Array2[z] == Array[i+z])
							a++;
						if (a==quest.length()-1)
						{
							System.out.print(change);
							i += quest.length()-1;
						}
					}
				}

				if(a==0)
					System.out.print(Array[i]);

				}

				else
					System.out.print(Array[i]);
			}
		}

		//찾는 문자열이 없을경우
		else 
			System.out.println("결과:찾는 문자열이 없습니다.");

		System.out.println("\n프로그램 종료");
	}

}