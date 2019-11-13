import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String inputValue = null;

		System.out.println("문자를 입력하세요!!");
		inputValue = sc.nextLine();

		int sizeOfString = inputValue.length();
		char charArray[] = new char[sizeOfString];
		inputValue.getChars(0, sizeOfString, charArray, 0);

		char array[]=new char[52];
		char A='A';

		for(int i=0; i<52; i++) {
			array[i]=A;
			A++;
			if(A=='Z'+1) A+=6;
		}

		int n=0; //알파벳이 총 몇번 나오는지 계산
		int space=1; //공백 몇 개나오는지 측정
		//영문자 개수 카운트
		for(int i = 0 ; i < 52 ; i++) {
			for(int j = 0 ; j < sizeOfString ; j++) {
				if(array[i]==charArray[j]) n++;
			}
		}

		//공백 몇번 나오는 계산
		for(int j = 0 ; j < sizeOfString ; j++) {
			if(charArray[j]==' ') space++;
		}

		if(n<1) space=0;
		System.out.println("\n-------------------\n");
		System.out.printf("단어는 총 %d자, 영문자는 %d자 입니다.",space,n);

		System.out.println("\n\n\n컴정 일본 IT기업 주문반 화이팅!! ^_^");
	}

}
