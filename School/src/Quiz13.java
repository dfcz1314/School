import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String selectedWord= "Yeungjin";

		int sizeOfString = selectedWord.length();
		char answerWord[] = new char[sizeOfString];
		selectedWord.getChars(0, sizeOfString, answerWord, 0);

		char inputValue[] = new char[sizeOfString];

		//출력할 값에 언더바 넣기
		for(int i = 0 ; i < sizeOfString ; i++) {
			inputValue[i] = '_';
		}

		System.out.println("hangman5");
		System.out.print("Given word : ");
		for(int i = 0 ; i < sizeOfString ; i++) {
			System.out.print(inputValue[i] + " ");
		}

		int array[]=new int[52];
		int n=0; //시도 횟수
		int x=1; //반복문 탈출을 위한~
		String st="st";
		String nd="nd";
		String rd="rd";
		String th="th";
		String sn="";

		//문자 받기 시작
		while(x != 0) {
			System.out.print("\n\nInput your guess: ");
			char input=sc.next().charAt(0);
			n++;
			int n2 = 0; // 중복 검사에 사용
			int b  = 0; // 정답에 입력받은 문자가 있는지 사용

			//입력받은 값이 있는지
			for(int i=0; i< sizeOfString ; i++) {
				if(input == answerWord[i] || (input-32) == answerWord[i] || (input+32) == answerWord[i]) 
				{
					inputValue[i] = answerWord[i];
					b++;
				}	
			}

			//중복 되는지 검사
			for(int j = 0 ; j < 52 ; j++) {
				if(input == array[j] ) n2++;
			}
			if(n == 1) 		sn = st;
			else if(n == 2) sn = nd;
			else if(n == 3) sn = rd;
			else 			sn = th;
			//시도 및 결과 출력
			System.out.printf("Your geuss(at %d%s attempt),",n,sn);

			if(n2 == 0) {	
				if(b > 0)System.out.printf(" %c, is good\n",input);
				else System.out.printf(" %c, is wrong\n",input);
			}
			else {
				if(b > 0) System.out.printf(" %c, was already tried (good)!\n",input);
				else System.out.printf(" %c, was already tried (wrong)!\n",input);
			}

			System.out.print("Given word : ");
			x = sizeOfString;
			for(int i = 0 ; i < sizeOfString ; i++) {
				System.out.print(inputValue[i] + " ");
				if(inputValue[i] != '_') x--;
			}

			//넣어진 값들을 차곡차곡 넣어준다
			char A='A';
			for(int i = 0 ; i < 52 ; i++) {
				if(A == input)
				{
					array[i]=A;
					if(i < 26)	array[i + 26] = (A + 32);
					else		array[i - 26] = (A - 32);
					break;
				}
				A++;
				if(A=='Z'+1) A+=6;
			}

		}
		System.out.printf("\ncongratulations ! correct word in %d attempts",n);
	}
}
