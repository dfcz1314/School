import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("학생수를 입력하세요");
		int n=sc.nextInt();

		int array[][]= new int[n][7];
		int rank[]=new int[n];

		for(int i=0; i<n; i++) {
			System.out.println(i+1 + "학번의 ");
			array[i][0]=i+1;
			rank[i]=1;
			for(int j=0; j<5; j++) {
				if(j==1) {
					System.out.println("국어 성적 입력");
					array[i][1]=sc.nextInt();
				}
				if(j==2) {
					System.out.println("영어 성적 입력");
					array[i][2]=sc.nextInt();
				}
				if(j==3) {
					System.out.println("수학 성적 입력");
					array[i][3]=sc.nextInt();
				}

				if(j>3)	array[i][4]= (array[i][1]+array[i][2]+array[i][3]);					

			}
		}


		for(int i=0; i<3; i++) {
			if(i!=0 && array[i][4]>array[i-1][4])
			{
				array[i][6]++;
			}
			if(i!=0 && array[i][4]<array[i-1][4])
				array[i-1][6]++;


		}

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				if(array[i][4] < array[j][4])
					rank[i] = rank[i] + 1;
			}
		}

		for(int i=0; i<n; i++) {
			array[i][6]=rank[i];
		}



		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[j][6]==(i+1)){
					for(int a=0; a<7; a++) {
						double x=(double)array[j][4]/3;
						if(a==6)	System.out.print(array[j][6]+"\n");
						else if (a==5) System.out.printf("%.1f\t",x);
						else System.out.print(array[j][a]+"\t");
					}


				}
			}

		}



	}

}
