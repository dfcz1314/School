import java.util.Scanner;

public class Quiz3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input_value=0; 
		System.out.println("������ �Է��ϼ���: ");
		input_value=sc.nextInt(); //���� �Է�
		if (input_value >= 95)
		{
			System.out.println("�����մϴ�. A+ �Դϴ�");
		}
		else if (input_value>=90)
		{
			System.out.println("�����մϴ�. A �Դϴ�");
		}
		else if (input_value>=85)
		{
			System.out.println("�����մϴ�. B+ �Դϴ�");
		}
		else if (input_value>=80)
		{
			System.out.println("�����մϴ�. B �Դϴ�");
		}
		else if (input_value>=75)
		{
			System.out.println("�����մϴ�. C+ �Դϴ�");
		}
		else if (input_value>=70)
		{
			System.out.println("�����մϴ�. C �Դϴ�");
		}
		else if (input_value>=65)
		{
			System.out.println("�����մϴ�. D+ �Դϴ�");
		}
		else if (input_value>=60)
		{
			System.out.println("�����մϴ�. D �Դϴ�");
		}
		else
		{
			System.out.println("�����մϴ�. F �Դϴ� ^^;;");
		}
	}

}
