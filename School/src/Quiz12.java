import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String inputValue = null;

		System.out.println("���ڸ� �Է��ϼ���!!");
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

		int n=0; //���ĺ��� �� ��� �������� ���
		int space=1; //���� �� ���������� ����
		//������ ���� ī��Ʈ
		for(int i = 0 ; i < 52 ; i++) {
			for(int j = 0 ; j < sizeOfString ; j++) {
				if(array[i]==charArray[j]) n++;
			}
		}

		//���� ��� ������ ���
		for(int j = 0 ; j < sizeOfString ; j++) {
			if(charArray[j]==' ') space++;
		}

		if(n<1) space=0;
		System.out.println("\n-------------------\n");
		System.out.printf("�ܾ�� �� %d��, �����ڴ� %d�� �Դϴ�.",space,n);

		System.out.println("\n\n\n���� �Ϻ� IT��� �ֹ��� ȭ����!! ^_^");
	}

}
