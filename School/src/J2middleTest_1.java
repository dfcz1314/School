
public class J2middleTest_1 {
	public static void main(String[] args) {
		//������ ���
		for(int i=1; i<10; i++) {
			//¦���� �����ܸ� ���
			if(i%2==0) {
				//�������� 1~10 ������ ���� ����
				for(int j=1; j<10; j++) {
					int value=i*j; //�������� ������
					if(j%3==0) // 3�� �϶� �������
						System.out.printf("%d X %d = %d\n",i,j,value);	
					else //�ƴҶ�
						System.out.printf("%d X %d = %d\t",i,j,value);
				}
			}
			//���� �Ѿ�� �������
			if(i>1)	System.out.println("");
		}

	}

}
