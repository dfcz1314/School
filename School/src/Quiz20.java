import java.util.Scanner;



public class Quiz20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=0;
		String value;
		
		while(true) {
			System.out.print("�Է°� : ");
			value=sc.nextLine();
			n=value.length();
			int a=0;
			for(int i=0; i<n; i++) {
				if(value.charAt(i)>102) a++;
				else if (value.charAt(i)<97 && value.charAt(i)>70) a++;
				else if(value.charAt(i)>57 && value.charAt(i)<65) a++;
				else if(value.charAt(i)<48) a++;
			}
			if(a==0 && value.length()<21) break;
			else System.out.println("��ȿ���� ���� 16�����Դϴ�. ���Է� �ϼ���");
		}
		
		//8���� ���Ҷ�
		int arr8length = 0, x = 0 ; //8���� ���Ҷ� ��
		if(4*n%3==0) arr8length = 4*n/3;
		else 		 arr8length = 4*n/3+1;
		
		int arr16[]  = new int[n]; //16���� ���� �迭
		int arr2[] = new int[4*n]; //2���� ���� �迭
		int arr8[] = new int[arr8length]; //8���� ���� �迭
		
		for(int i=0; i<n; i++) {
			if(value.charAt(i)<60) arr16[i] = value.charAt(i)-48;
			else if (value.charAt(i)<75) arr16[i] = value.charAt(i)-55;
			else arr16[i]=value.charAt(i)-87;
		}
		
		//������
		long jinsu10=0;
		int b=0;
		for(int i=n-1; i>=0; i--) {
			long k = (long)Math.pow(16, b);
			jinsu10 += arr16[i]*k;
			b++;
		}
		
		//������
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				if(arr16[i]%2==0) arr2[4*(i+1)-j-1]=0;
				if (arr16[i]%2==1) arr2[4*(i+1)-j-1]=1;
				arr16[i] /= 2;
			}
		}

		//������
		for(int i=0; i<arr8length; i++) {
			for(int j=0; j<3; j++) {
				arr8[i] += arr2[4*n-1-j-x]*(int)Math.pow(2, j);
				if(4*n-1-j-x<1) break;
			}	
			x = x + 3;
		}
		
		System.out.println("\n�����");
		System.out.print("������: ");
		for(int i=0; i<4*n; i++) {
			System.out.print(arr2[i]);
			if((i+1)%4==0) System.out.print(" ");
		}
		System.out.print("\n������: " + jinsu10);

		System.out.print("\n������: ");
		for(int i=arr8length-1; i>=0; i--) {
			if(i==arr8length-1 && arr8[i]==0) i--;
			if(i==arr8length-2 && arr8[i]==0 && arr8[i+1]==0) i--;
			System.out.print(arr8[i]);
		}
	}
}