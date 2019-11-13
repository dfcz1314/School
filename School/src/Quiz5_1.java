import java.util.Arrays;
import java.util.Scanner;

public class Quiz5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0; i<5; i++){
			System.out.println("숫자 입력: ");
			int value=sc.nextInt();
			array[i]=value;
			if (value<1)
			{
				i--;
				System.out.println("1이상의 숫자를 입력하시오");
			}
		}
		System.out.print("Inserted values: ");
		for(int i=0; i<5; i++){
			if(i<4)
			{System.out.print(array[i]+",");}
			else
			{System.out.println(array[i]);}
		}

		Arrays.sort(array);
		System.out.println("Maximum value: "+ array[4]);
		System.out.println("Minimum value: "+ array[0]);
		System.out.println("median value: "+ array[2]);
	}

}
