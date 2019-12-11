import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nan=0; //�� ����� �л��� ������ �޾Ҵ���
		int arr[][] = new int[5][8];

		while(true) {
			int n = 0; //���� 1~4
			System.out.println("1. �л����� �Է��ϱ�");
			System.out.println("2. �л����� ó�� ��� ����ϱ�");
			System.out.println("3. �������� �������� ����ϱ�");
			System.out.println("4. ���м��� ���� �������� ����ϱ�");
			n = sc.nextInt();

			if(n == 1) {
				
				nan=0;
				//�й� ���� �ޱ� �� �հ� ��� �� ���
				for(int i=0; i<5; i++) {
					System.out.print("\n�й�(-100�� ����) : ");
					int a=0;
					int x=1;

					//�й� �Է�
					while(x!=0) {
						x=0;
						a=sc.nextInt();

						//�ߺ��� �Ǻ�
						for(int k=0; k<i; k++) {
							if(arr[k][0] == a) {
								x++;
								System.out.print("�ߺ� �ٽ� �Է��Ͻÿ�: ");
								break;
							}
						}
					}

					if(a==-100) break;
					arr[i][0] = a; //�й�

					System.out.print("\n���� : ");
					int korean = sc.nextInt();
					arr[i][1] = korean;

					System.out.print("\n���� : ");
					int english = sc.nextInt();
					arr[i][2]=english;

					System.out.print("\n���� : ");
					int math = sc.nextInt();
					arr[i][3] = math;

					arr[i][4] = korean + english + math;
					arr[i][7]=1;
					nan++;
				} //�޴� �� ��

				for(int i=0; i<nan; i++) {
					for(int j=0; j<nan; j++) {
						if(arr[i][4]<arr[j][4]) arr[i][7]++;
					}
				}

			} //n==1 �϶� ��


			if(n==2) {
				//����������� ���
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

				if (nan==0) System.out.println("�Է°��� �����ϴ�.");
			}	//n=2�϶� ��

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
				if (nan==0) System.out.println("�Է°��� �����ϴ�.");
			} //n=3 �϶� ��

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

				if (nan==0) System.out.println("�Է°��� �����ϴ�.");
			}
		} // �ݺ��� ��

	}
}