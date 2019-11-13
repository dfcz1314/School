import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//키보드로부터 문자열 입력
		String inputValue=null;
		System.out.print("문자열을 입력하세요 : ");
		inputValue = sc.nextLine();

		//입력 받은 문자열의 문자 길이
		int sizeOfString = inputValue.length();

		//입력받은 문자열의 길이 만큼 char 형 배열 생성
		char charArray[] = new char[sizeOfString];
		inputValue.getChars(0, sizeOfString, charArray, 0);

		char array[]=new char[52];
		char N='A';
		for(int i=0; i<52; i++) {
			if(N == 'Z'+1) N += 6;
			array[i]=N;
			N++;
		}

		int x = 0; //뒤에 쉼표 없애줄때 사용
		for(int j = 0; j < 52; j++) {
			int n=0; //몇번나온지 세어 줌
			for(int i = 0; i < sizeOfString; i++) {
				if(array[j]==charArray[i])		n++;
			}

			if(n > 0)
			{
				if(x > 0)	System.out.print(", ");

				System.out.print(array[j] + " : " + n);
				x++;
			}
		}

	}
}
