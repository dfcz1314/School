import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է��� ���ڿ��� ����");
		int n = sc.nextInt();
		System.out.println("���� ��� ����? (1) ���� , (2) ����");
		int choice = sc.nextInt();

		System.out.println("���� �Է��ϼ���");
		String[] arr=new String[n];
		//���� �Է¹޾Ƽ� char���� �����ϱ�
		for(int i=0; i<n; i++) {
			String a = sc.next();
			arr[i]=a;
		}

		String temp; 
		for(int i = 0 ; i < n-1 ; i++) {

			int min = i ;
			// i�� �ڸ� ���ڿ��� ���� �ּڰ����� �ٲ��ִ� ���� ����
			for(int j = i+1 ; j < n ; j++) {
				int x=arr[min].length();
				int y=arr[j].length();
				int z=0;

				// �� ��
				if(x>=y) z=y; 
				if(x<=y) z=x;
				for(int k = 0 ; k < z ; k++) {
					if(arr[min].charAt(k) > arr[j].charAt(k))
					{
						min=j;
						break;
					}
					if(arr[min].charAt(k) < arr[j].charAt(k)) break;
					if(k==arr[j].length()-1) min=j;
				}

			}
			//i�� �ִ� ���� ���� �ּڰ����� �ٲ���
			temp     = arr[i];
			arr[i]   = arr[min];
			arr[min] = temp;
		}

		//�������� ���
		if(choice==1) {
			for(int i=0; i<n; i++) {
				System.out.println(arr[i]);
			}
		}

		//�������� ���
		if(choice==2) {
			for(int i=n-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}

	}

}
