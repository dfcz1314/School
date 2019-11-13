
public class Quiz5_2 {

	public static void main(String[] args) {
		char A=65; 
		int number=26; // 27번째 줄 부터 사용할 변수

		for(int i=1; i<52; i++)
		{	A=65;

		if(i<26)
		{for (int j=0; j<i; j++){
			System.out.print(A);
			A++;
		}
		}
		else
		{
			for (int j=0; j<number; j++){
				System.out.print(A);
				A++;		
			}
			number--;
		}	
		System.out.println(""); //줄바꿈
		} 
	}

}
