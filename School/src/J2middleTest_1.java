
public class J2middleTest_1 {
	public static void main(String[] args) {
		//구구단 출력
		for(int i=1; i<10; i++) {
			//짝수단 구구단만 출력
			if(i%2==0) {
				//구구단의 1~10 까지의 숫자 생성
				for(int j=1; j<10; j++) {
					int value=i*j; //구구단의 곱셈값
					if(j%3==0) // 3열 일때 띄워쓰기
						System.out.printf("%d X %d = %d\n",i,j,value);	
					else //아닐때
						System.out.printf("%d X %d = %d\t",i,j,value);
				}
			}
			//단이 넘어갈때 띄워쓰기
			if(i>1)	System.out.println("");
		}

	}

}
