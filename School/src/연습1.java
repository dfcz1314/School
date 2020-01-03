import java.util.Scanner;

class student{
	int num;
	int id;
	int kor;
	int eng;
	int math;
	int sci;
	int sum;
	int avg;

	//총점수
	void getsum() {
		sum = kor + eng + math + sci;
	}

	//평균
	void getavg() {
		avg = sum/4;
	}

	//성적 출력
	void out() {
		System.out.println(num + "\t" + id + "\t" + kor + "\t" + eng 
				+ "\t" + math + "\t" + sci + "\t" + sum + "\t" + avg);
	}

	void out2() {
		System.out.println("학번 : " + id + " 국어 : " + kor + " 영어 : " + eng + 
				" 수학 : " + math + " 과학 : " + sci + " 총점 : " + sum + " 평균 : " + avg);
	}

}

public class 연습1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		student std[] = new student[3];
		std[0] = new student();
		std[1] = new student();
		std[2] = new student();

		int n=0;
		int a=0;

		while(a != 5) {

			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 성적 출력 (입력 순서대로 출력)");
			System.out.println("3. 성적 수정하기");
			System.out.println("4. 순위 순으로 출력");
			System.out.println("5. 종료");

			System.out.print("메뉴 선택 : ");
			a = sc.nextInt(); //메뉴 선택

			//1번 메뉴 일때
			if(a==1) {
				int x=0;
				int y=0;
				
				System.out.println("학번을 입력 하세요:");
				int number	= sc.nextInt();
				
				//학번이 있는경우 체크
				for(int i=0; i<3; i++) {
					if(number == std[i].id && n!=i) {
						y++;
						x = i;
					}
				}
				
				//학번이 있을경우
				if(y>0) {
					System.out.println("국어 성적을 입력 하세요");
					std[x].kor 		= sc.nextInt();

					System.out.println("영어 성적을 입력 하세요");
					std[x].eng 		= sc.nextInt();

					System.out.println("수학 성적을 입력 하세요");
					std[x].math 	= sc.nextInt();

					System.out.println("과학 성적을 입력 하세요");
					std[x].sci 		= sc.nextInt();

					std[x].getsum();
					std[x].getavg();
					System.out.println("입력값 : ");
					std[x].out2();
				}
				
				//학번이 없을경우
				else {
					std[n].num  	= n+1;
					std[n].id		= number;
					System.out.println("국어 성적을 입력 하세요");
					std[n].kor 		= sc.nextInt();

					System.out.println("영어 성적을 입력 하세요");
					std[n].eng 		= sc.nextInt();

					System.out.println("수학 성적을 입력 하세요");
					std[n].math 	= sc.nextInt();

					System.out.println("과학 성적을 입력 하세요");
					std[n].sci 		= sc.nextInt();

					std[n].getsum();
					std[n].getavg();
					System.out.println("입력값 : ");
					std[n].out2();
					n++;
				}
				
				
			}	//1번 끝

			//2번 일때
			if(a==2) {
				System.out.println("입력순번\t학번\t국어\t영어\t수학\t과학\t총점\t평균");
				for(int i=0; i<n; i++) {
					std[i].out();
				}
			}	//2번 끝

			//3번 일때
			if(a==3) {
				int z = 0;  // 
				int re = 0; //3회 이상 잘못 넣을 경우 돌아가게 함
				System.out.println("수정 할 학생의 학번을 입력 하세요");

				//수정 할 학생 번호가 있을때 까지 반복
				while(true) {
					int x = sc.nextInt(); //학번 입력
					int y = 0; 			  // 학번 있는지 없는지 체크

					//학번이 있는경우 체크
					for(int i=0; i<3; i++) {
						int number = std[i].id;
						if(x==number) {
							y++;
							z = i;
						}
					}

					//3번동안 입력된 학번이 없을경우
					if(re==2) break;

					if(y==0) {
						System.out.println("입력하신 학번은 없는 학번입니다. 다시 입력하세요.");
						re++;
					}
					else	break;
				}

				if(re==2) continue;

				System.out.println("수정 할 과목 번호를 입력 하세요 : 1.국어  2.영어  3.수학  4.과학");
				int choice=sc.nextInt();

				switch(choice) {
				case 1 :
					System.out.println("국어 과목의 수정 성적을 입력 하세요");
					std[z].kor = sc.nextInt();
					break;
				case 2 :
					System.out.println("영어 과목의 수정 성적을 입력 하세요");
					std[z].eng = sc.nextInt();
					break;
				case 3 :
					System.out.println("수학 과목의 수정 성적을 입력 하세요");
					std[z].math = sc.nextInt();
					break;
				case 4 :
					System.out.println("과학 과목의 수정 성적을 입력 하세요");
					std[z].sci = sc.nextInt();
					break;
				}

				std[z].getsum();
				std[z].getavg();

				System.out.println(std[z].id + "학생의 수정된 성적입니다.");

				System.out.println("입력순번\t학번\t국어\t영어\t수학\t과학\t총점\t평균");
				std[z].out();
			} // 3번 메뉴 끝
			
			if(a==4) {
				int c=0;
				for(int i=400; i>=0; i--) {
					for(int j=0; j<3; j++) {
						if(std[j].sum==i) {
							std[j].out();
							c++;
						}
					}
					if(c==3) break;
				}
			}
			
			if(a==5) break;

			System.out.println();
		}
		
	}
	
}
