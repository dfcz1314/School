import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nan=0; //총 몇명의 학생의 성적을 받았는지
		int arr[][] = new int[5][8];

		while(true) {
			int n = 0; //선택 1~4
			System.out.println("1. 학생성적 입력하기");
			System.out.println("2. 학생성적 처리 결과 출력하기");
			System.out.println("3. 순위기준 내림차순 출력하기");
			System.out.println("4. 수학성적 기준 오름차순 출력하기");
			n = sc.nextInt();

			if(n == 1) {
				
				nan=0;
				//학번 성적 받기 및 합계 평균 등 계산
				for(int i=0; i<5; i++) {
					System.out.print("\n학번(-100은 종료) : ");
					int a=0;
					int x=1;

					//학번 입력
					while(x!=0) {
						x=0;
						a=sc.nextInt();

						//중복값 판별
						for(int k=0; k<i; k++) {
							if(arr[k][0] == a) {
								x++;
								System.out.print("중복 다시 입력하시오: ");
								break;
							}
						}
					}

					if(a==-100) break;
					arr[i][0] = a; //학번

					System.out.print("\n국어 : ");
					int korean = sc.nextInt();
					arr[i][1] = korean;

					System.out.print("\n영어 : ");
					int english = sc.nextInt();
					arr[i][2]=english;

					System.out.print("\n수학 : ");
					int math = sc.nextInt();
					arr[i][3] = math;

					arr[i][4] = korean + english + math;
					arr[i][7]=1;
					nan++;
				} //받는 것 끝

				for(int i=0; i<nan; i++) {
					for(int j=0; j<nan; j++) {
						if(arr[i][4]<arr[j][4]) arr[i][7]++;
					}
				}

			} //n==1 일때 끝


			if(n==2) {
				//받은순서대로 출력
				for(int i=0; i<nan; i++) {
					for(int j=0; j<8; j++) {
						if(j==5) 	  System.out.printf("%.1f"+"\t",(arr[i][4]/(double)3));
						else if(j==6){	
							double sum=0;
							for(int k=1; k<4; k++) {
								sum += Math.pow( ((arr[i][4] / (double)3) - arr[i][k]) , 2);
							}
							double bunsan = Math.sqrt(sum/3);
							System.out.printf("%.1f\t",bunsan);
						}
						else 		  System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}

				if (nan==0) System.out.println("입력값이 없습니다.");
			}	//n=2일때 끝

			if(n==3) {

				int y=nan;

				for(int z=0; z<nan; z++) {

					for(int k=0; k<nan; k++) {
						if(arr[k][7]==y) {
							for(int j=0; j<8; j++) {
								if(j==5) 	  System.out.printf("%.1f"+"\t",(arr[k][4]/(double)3));

								else if(j==6){	
									double sum=0;
									for(int a=1; a<4; a++) {
										sum += Math.pow( ((arr[k][4] / (double)3) - arr[k][a]) , 2);
									}
									double bunsan = Math.sqrt(sum/3);
									System.out.printf("%.1f\t",bunsan);
								}

								else 		  System.out.print(arr[k][j]+"\t");
							}
							System.out.println();
						}
					}
					
					y--;
				}
				if (nan==0) System.out.println("입력값이 없습니다.");
			} //n=3 일때 끝

			if(n==4) {
				int min=0;
				for(int i=0; i<nan; i++) {
					if(arr[min][3]>arr[i][3]) min=i; 
				}
				int max=0;
				for(int i=0; i<nan; i++) {
					if(arr[max][3]<arr[i][3]) max=i; 
				}
				int x=arr[min][3];
				int y=arr[max][3];
				for(int i=x; i<y+1; i++) {
					for(int k=0; k<nan; k++) {
						if(arr[k][3]==i) {
							for(int j=0; j<8; j++) {
								if(j==5) 	  System.out.printf("%.1f"+"\t",(arr[k][4]/(double)3));
								else if(j==6){	
									double sum=0;
									for(int a=1; a<4; a++) {
										sum += Math.pow( ((arr[k][4] / (double)3) - arr[k][a]) , 2);
									}
									double bunsan = Math.sqrt(sum/3);
									System.out.printf("%.1f\t",bunsan);
								}
								else 		  System.out.print(arr[k][j]+"\t");
							}
							System.out.println();
						}
					}
				}

				if (nan==0) System.out.println("입력값이 없습니다.");
			}
		} // 반복문 끝

	}
}