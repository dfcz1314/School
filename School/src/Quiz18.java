import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("N X N ��Ʈ����");
		System.out.print("N�� ���� ���ڸ� �Է��Ͻÿ� : ");
		int n=sc.nextInt();

		int array[][]= new int[n][n];
		int arr[]=new int[n*n];

		//1������ �迭�� �ߺ��� ���� n*n ��ŭ�� ���� ����
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*n*n)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}		
		} 

		//1���� �迭�� ���ڸ� 2���� �迭�� ���ڿ� ����ֱ�
		int a=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array[i][j]=arr[a];
				System.out.print(array[i][j]+"\t");
				a++;
			}
			System.out.println();
		}

		int choice=0;
		while(choice!=5) {

			System.out.println("\n1) ���������� 90�� ȸ��");
			System.out.println("2) �������� 90�� ȸ��");
			System.out.println("3) ���Ϲ���");
			System.out.println("4) �¿����");
			System.out.println("5) ���α׷�����\n");
			System.out.print("����� ������? : ");
			choice=sc.nextInt();

			int array2[][]= new int[n][n];

			// ������ 90�� ȸ��
			if(choice==1) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[j][n-i-1]=array[i][j];
					}
				}
			}

			// ���� 90�� ȸ��
			if(choice==2) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[n-j-1][i]=array[i][j];
					}
				}
			}

			// ���� ����
			if(choice==3) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[n-i-1][j]=array[i][j];
					}
				}
			}

			// �¿����
			if(choice==4) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[i][n-j-1]=array[i][j];
					}
				}
			}
			// ���õ� ��ȣ�� ���Ǵ�� �迭�� ���� �� ���
			if(choice!=5) {
				System.out.println();
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						System.out.print(array2[i][j]+"\t");
					}
					System.out.println();
				}
			}
			// ���� ��Ʈ
			if(choice==5) System.out.println("�̿��� �ּż� �����մϴ�. ���� �Ϸ� �Ǽ���");
		}
	}

}
