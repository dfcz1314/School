import java.util.Scanner;

public class Value_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("��ǰ�Ѿ�: ");
		int total=scan.nextInt(); 	//��ǰ�ѱݾ�
		int received; 				//������
		final double vat=total*0.1; //����
		double change; 				//�Ž�����

		do
		{
			System.out.println("������: ");
			received=scan.nextInt(); 
			change=received-(total+vat);
			if(total+vat>received)
			{System.out.println("���� ���� �����մϴ�. �ٽ� �Է��ϼ���!!");}
		}
		while(total+vat>received);
		System.out.println("�ΰ��� "+(int)vat);
		System.out.println("�Ž����� "+(int)change);
	}

}
