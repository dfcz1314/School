import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("��� N�� ũ�⸦ �Է��ϼ���:");
		int N = sc.nextInt();
		while(N<2 || N>10) {
			System.out.println("2~10 ������ �� �Է��Ͻÿ�");
			N = sc.nextInt();
		}

		System.out.println("������ ����� ���� ������(1: �ð�, 2: �ݽð�):");
		int direction = sc.nextInt();

		int array[][] = new int[N][N];
		int x=0,y=0,count=1;
		int n=N;

		if(direction==1) {
			while(true) {
				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					y++;
				}
				y--;
				x++;
				N--;

				if(count==N*N+1) break;
				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					x++;
				}
				y--;
				x--;

				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					y--;
				}
				y++;
				x--;
				N--;

				//��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					x--;
				}
				x++;
				y++;
				if(count==N*N+1) break;
			}


			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(array[i][j] +"\t");
				}
				System.out.println();
			}
		}

		if(direction==2) {
			while(true) {
				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					x++;
				}
				x--;
				y++;
				N--;

				if(count==N*N+1) break;
				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					y++;
				}
				x--;
				y--;

				// ��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					x--;
				}
				x++;
				y--;
				N--;

				//��
				for(int i=0; i<N; i++) {
					array[x][y]=count;
					count++;
					y--;
				}
				y++;
				x++;
				if(count==N*N+1) break;
			}

			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(array[i][j] +"\t");
				}
				System.out.println();
			}
		}

	}

}
