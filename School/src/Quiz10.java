import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//Ű����κ��� ���ڿ� �Է�
		String inputValue=null;
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		inputValue = sc.nextLine();

		//�Է� ���� ���ڿ��� ���� ����
		int sizeOfString = inputValue.length();

		//�Է¹��� ���ڿ��� ���� ��ŭ char �� �迭 ����
		char charArray[] = new char[sizeOfString];
		inputValue.getChars(0, sizeOfString, charArray, 0);

		char array[]=new char[52];
		char N='A';
		for(int i=0; i<52; i++) {
			if(N == 'Z'+1) N += 6;
			array[i]=N;
			N++;
		}

		int x = 0; //�ڿ� ��ǥ �����ٶ� ���
		for(int j = 0; j < 52; j++) {
			int n=0; //��������� ���� ��
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
