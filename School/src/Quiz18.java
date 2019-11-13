import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("N X N 매트릭스");
		System.out.print("N에 넣을 숫자를 입력하시오 : ");
		int n=sc.nextInt();

		int array[][]= new int[n][n];
		int arr[]=new int[n*n];

		//1차원에 배열에 중복값 없이 n*n 만큼의 숫자 생성
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*n*n)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}		
		} 

		//1차원 배열의 숫자를 2차원 배열의 숫자에 집어넣기
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

			System.out.println("\n1) 오른쪽으로 90도 회전");
			System.out.println("2) 왼쪽으로 90도 회전");
			System.out.println("3) 상하반전");
			System.out.println("4) 좌우반전");
			System.out.println("5) 프로그램종료\n");
			System.out.print("당신의 선택은? : ");
			choice=sc.nextInt();

			int array2[][]= new int[n][n];

			// 오른쪽 90도 회전
			if(choice==1) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[j][n-i-1]=array[i][j];
					}
				}
			}

			// 왼쪽 90도 회전
			if(choice==2) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[n-j-1][i]=array[i][j];
					}
				}
			}

			// 상하 반전
			if(choice==3) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[n-i-1][j]=array[i][j];
					}
				}
			}

			// 좌우반전
			if(choice==4) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						array2[i][n-j-1]=array[i][j];
					}
				}
			}
			// 선택된 번호의 조건대로 배열을 변경 후 출력
			if(choice!=5) {
				System.out.println();
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						System.out.print(array2[i][j]+"\t");
					}
					System.out.println();
				}
			}
			// 종료 멘트
			if(choice==5) System.out.println("이용해 주셔서 감사합니다. 좋은 하루 되세요");
		}
	}

}
