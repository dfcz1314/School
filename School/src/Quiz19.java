import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���л� ���� �Է��ϼ���(1<=n<=5)");
		int n=sc.nextInt();
		int k=1;
		int b=(int)Math.pow(10, n);
		//�߻� ������ ����� ��
		for(int i=n; i>0; i--) {
			k = k*i;
		}

		System.out.println("�߻� ������ ����� �� : " + k);
		System.out.println();
		int array[][] = new int[k][n];
		int array2[]  = new int[k];

		for(int i=0; i<k; i++) {
			//2���� �迭�� ������ �־��ֱ� ������ 1~n �ߺ� x
			for(int j=0; j<n; j++) {
				int x = (int)(Math.random()*n)+1;
				array[i][j]=x;
				//������ �ߺ� ����
				for(int z=0; z<j; z++) {
					if(array[i][j]==array[i][z]) {
						j--;
						break;
					}	
				}
			}

			// �տ� ���� �迭��� ��
			for(int y=0; y<i; y++) {
				int a=0;
				for(int j=0; j<n; j++) {
					if(array[i][j]==array[y][j]) a++;
				}
				if(a==n) {
					i--;
					break;
				}

			}
		}

		for(int i=0; i<k; i++) {
			int a=b/10;
			for(int j=0; j<n; j++) {
				array2[i] = array2[i] + (a*array[i][j]);
				a /= 10;
			}
		}

		for(int s=b/10; s<b; s++)
			for(int i=0; i<k; i++) {	
				if(s==array2[i]) {
					for(int j=0; j<n; j++) {
						System.out.print(array[i][j] +"\t");
					}
					System.out.println();
				}
			}

	}

}