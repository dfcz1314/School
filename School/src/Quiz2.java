import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=null; //����ڿ��� �Է¹޴� ��
		int T =0; //�õ� Ƚ��
		String y= new String("q"); // 

		while(true)
		{	x=sc.nextLine(); //����ڿ��� x�� �� ���� �Է¹޴´�
		if(x.equals(y)) //�Է¹��� ���� 'q' �̸� ����
		{System.out.println("�̿����ּż� �����մϴ�");
		break;
		}

		int n = Integer.parseInt(x); //�Է¹��� ���� ���ڷ� ��ȯ�����ش� 

		if(n==20000) //�Է¹��� ���� 20000 �̸� ����
		{
			System.out.println("�̿����ּż� �����մϴ�");
			break;
		}


		if(n>0) //�Է¹��� ���� 0���� Ŭ��
		{
			T++;
			System.out.println(T + "��° �Է� ���� = " + x);
			if(n%2==0)
			{
				System.out.println("\t¦�� �Դϴ�.");
			}
			else
			{
				System.out.println("\tȦ�� �Դϴ�.");
			}

			if(n%3==0)
			{
				System.out.println("\t3�� ����Դϴ�.");
			}
			else if(n%7==0)
			{
				System.out.println("\t7�� ����Դϴ�.");
			}
		}

		else //�Է¹��� ���� 0���� �϶�
		{
			System.out.println("1�̻� ����� �Է����ּ���");
		}
		}
	}
}
