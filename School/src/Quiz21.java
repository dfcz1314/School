import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력할 문자열의 개수");
		int n = sc.nextInt();
		System.out.println("정렬 방식 선택? (1) 오름 , (2) 내림");
		int choice = sc.nextInt();

		System.out.println("문자 입력하세요");
		String[] arr=new String[n];
		//문자 입력받아서 char형에 정렬하기
		for(int i=0; i<n; i++) {
			String a = sc.next();
			arr[i]=a;
		}

		String temp; 
		for(int i = 0 ; i < n-1 ; i++) {

			int min = i ;
			// i의 자리 문자열을 제일 최솟값으로 바꿔주는 과정 시작
			for(int j = i+1 ; j < n ; j++) {
				int x=arr[min].length();
				int y=arr[j].length();
				int z=0;

				// 값 비교
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
			//i에 있는 값을 제일 최솟값으로 바꿔줌
			temp     = arr[i];
			arr[i]   = arr[min];
			arr[min] = temp;
		}

		//오름차순 출력
		if(choice==1) {
			for(int i=0; i<n; i++) {
				System.out.println(arr[i]);
			}
		}

		//내림차순 출력
		if(choice==2) {
			for(int i=n-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}

	}

}
