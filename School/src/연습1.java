import java.util.Scanner;

class student{
	int num;
	int number;
	int kor;
	int eng;
	int math;
	int sci;
	int sum;
	int avg;

	//������
	void getsum() {
		sum = kor + eng + math + sci;
	}

	//���
	void getavg() {
		avg = sum/4;
	}

	//���� ���
	void out() {
		System.out.println(num + "\t" + number + "\t" + kor + "\t" + eng 
				+ "\t" + math + "\t" + sci + "\t" + sum + "\t" + avg);
	}

}

public class ����1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		student std[] = new student[3];
		std[0] = new student();
		std[1] = new student();
		std[2] = new student();

		int n=0;
		int a=0;

		while(a != 4) {

			System.out.println("1. ���� �Է�");
			System.out.println("2. ��ü ���� ��� (�Է� ������� ���)");
			System.out.println("3. ���� �����ϱ�");
			System.out.println("4. ����");

			System.out.println("�޴� ���� : ");
			a = sc.nextInt(); //�޴� ����

			//1�� �޴� �϶�
			if(a==1) {
				std[n].num 		= n+1;

				System.out.println("�й��� �Է� �ϼ���:");
				std[n].number	= sc.nextInt();

				System.out.println("���� ������ �Է� �ϼ���");
				std[n].kor 		= sc.nextInt();

				System.out.println("���� ������ �Է� �ϼ���");
				std[n].eng 		= sc.nextInt();

				System.out.println("���� ������ �Է� �ϼ���");
				std[n].math 	= sc.nextInt();

				System.out.println("���� ������ �Է� �ϼ���");
				std[n].sci 		= sc.nextInt();

				std[n].getsum();
				std[n].getavg();
				System.out.println(std[n].sum);
				System.out.println(std[n].avg);
				n++;
			}	//1�� ��

			//2�� �϶�
			if(a==2) {
				System.out.println("�Է¼���\t�й�\t����\t����\t����\t����\t����\t���");
				for(int i=0; i<n; i++) {
					std[i].out();
				}
			}	//2�� ��

			//3�� �϶�
			if(a==3) {
				int z = 0;  // 
				int re = 0; //3ȸ �̻� �߸� ���� ��� ���ư��� ��
				System.out.println("���� �� �л��� �й��� �Է� �ϼ���");

				//���� �� �л� ��ȣ�� ������ ���� �ݺ�
				while(true) {
					int x = sc.nextInt(); //�й� �Է�
					int y = 0; 			  // �й� �ִ��� ������ üũ

					//�й��� �ִ°�� üũ
					for(int i=0; i<3; i++) {
						int number = std[i].number;
						if(x==number) {
							y++;
							z = i;
						}
					}

					//3������ �Էµ� �й��� �������
					if(re==2) break;

					if(y==0) {
						System.out.println("�Է��Ͻ� �й��� ���� �й��Դϴ�. �ٽ� �Է��ϼ���.");
						re++;
					}
					else	break;

				}

				if(re==2) continue;
				
				System.out.println("���� �� ���� ��ȣ�� �Է� �ϼ��� : 1.����  2.����  3.����  4.����");
				int choice=sc.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[z].kor = sc.nextInt();
					break;
				case 2 :
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[z].eng = sc.nextInt();
					break;
				case 3 :
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[z].math = sc.nextInt();
					break;
				case 4 :
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[z].sci = sc.nextInt();
					break;
				}

				std[z].getsum();
				std[z].getavg();

				System.out.println(std[z].number + "�л��� ������ �����Դϴ�.");

				System.out.println("�Է¼���\t�й�\t����\t����\t����\t����\t����\t���");
				std[z].out();
			} // 3�� �޴� ��

			if(a==4) break;

		}

	}

}
