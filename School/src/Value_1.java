import java.util.Scanner;

public class Value_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("평균속도를 입력하세요! <km/h>");
		double average=scan.nextInt();
		System.out.println("주행거리 입력하세요! <km/h>");
		double distance=scan.nextInt();
		double time=distance/average;
		System.out.printf("주행시간: "+ "%.4f%n",time);
	}

}
