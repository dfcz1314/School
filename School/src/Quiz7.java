import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		final int MAX_SIZE = 30; // ���ڿ� �迭�� ũ��
		String inputValues = null; //Ű����κ��� �Է� ���� ���ڿ� ����
		System.out.println("�Է� ����:"); //Ű����� ���� ���ڿ��� �Է� �޾� String �� ����\
		inputValues=scn.nextLine(); //�Է¹���
		//Ű����κ��� �Է� ���� ���ڿ��� Char�� �迭�� ����
		// ã��/�ٲٱ� ��� ������ ���
		char Array[] = new char[MAX_SIZE];

		//����� ���ڿ��� Char�� array ���� charArray�� ����
		inputValues.getChars(0, inputValues.length(), Array, 0);

		//ã�� ���ڿ� �Է� �ޱ�
		System.out.println("ã�� ���ڿ�:");
		String quest=scn.nextLine();

		char Array2[]= new char[quest.length()]; //ã�� ���ڿ��� char ���� ����
		quest.getChars(0, quest.length(), Array2, 0);

		//ã�� ���ڿ��� �ִ��� ������ �˻�
		int n=0;
		for(int i=0; i<inputValues.length(); i++) {
			//ã�� ���ڰ� 1�� �϶�
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


		//ã�� ���ڿ��� ���� ���
		if(n>0) {
			System.out.println("�ٲ� ���ڿ�:");
			String change=scn.nextLine();

			// ���ڿ� ���
			System.out.print("���: ");
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

		//ã�� ���ڿ��� �������
		else 
			System.out.println("���:ã�� ���ڿ��� �����ϴ�.");

		System.out.println("\n���α׷� ����");
	}

}