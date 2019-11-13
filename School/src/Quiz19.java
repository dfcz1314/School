import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("남학생 수를 입력하세요(1<=n<=5)");
		int n=sc.nextInt();
		int k=1;
		int b=(int)Math.pow(10, n);
		//발생 가능한 경우의 수
		for(int i=n; i>0; i--) {
			k = k*i;
		}

		System.out.println("발생 가능한 경우의 수 : " + k);
		System.out.println();
		int array[][] = new int[k][n];
		int array2[]  = new int[k];

		for(int i=0; i<k; i++) {
			//2차원 배열에 랜덤값 넣어주기 범위는 1~n 중복 x
			for(int j=0; j<n; j++) {
				int x = (int)(Math.random()*n)+1;
				array[i][j]=x;
				//랜덤값 중복 제거
				for(int z=0; z<j; z++) {
					if(array[i][j]==array[i][z]) {
						j--;
						break;
					}	
				}
			}

			// 앞에 나온 배열들과 비교
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