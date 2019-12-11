
public class Quiz22 {

	public static void main(String[] args) {

		//���ڿ� ��ġ��
		char value1[] = {'h','e','l','l','o'};
		char value2[] = {' ','w','o','r','l','d'};	
		char values[] = concatenate(value1, value2);
		System.out.println(values);

		//���ڿ� ��
		boolean result = compareTo(
				new String("���ڿ� 1").toCharArray(),
				new String("���ڿ� 2").toCharArray()
				);
		System.out.println(result ? "����" : "�ٸ�");

		//���ڿ� ��ġ ã��
		int index = indexOf(
				new String("abcdefg").toCharArray(),
				new String("cde").toCharArray()
				);
		System.out.println(index);

		//���ڿ� ġȯ
		char result2[] = replace(
				new String("abcdefg").toCharArray(),
				new String("cde").toCharArray(),
				new String("k").toCharArray()
				);
		System.out.println(result2);

	}
	//���� �޼ҵ� ��

	// ���ڿ� ��ġ��
	public static char[] concatenate(char[] arg1, char[] arg2) {
		char[] value = new char[arg1.length+arg2.length];
		for(int i=0; i<arg1.length; i++) {
			value[i]=arg1[i];
		}
		for(int i=0; i<arg2.length; i++) {
			value[i+arg1.length]=arg2[i];
		}
		return value;
	}

	//���ڿ� ��
	public static boolean compareTo(char[] arg1, char[] arg2) {
		int n=0;
		for(int i=0; i<arg1.length; i++) {
			if(arg1[i]==arg2[i]) n++;
		}
		boolean a=true;
		boolean b=false;
		if(n==arg1.length && arg1.length==arg2.length) return a;
		else 										   return b;
	}

	//���ڿ� ��ġ ã��
	public static int indexOf(char[] arg1, char[] arg2) {
		int n=0;
		for(int i=0; i<arg1.length; i++) {
			if(arg1[i]==arg2[0]) {
				int a=0;
				for(int j=0; j<arg2.length; j++) {
					if(arg2[j]==arg1[i+j]) a++;
				}
				if(a==arg2.length) 
				{
					n = i;
					break;
				}
			}
		}
		if(n==0) n=-1;
		return n;
	}

	//���ڿ� ġȯ
	public static char[] replace(char[] arg1, char[] arg2, char[] arg3) {
		int n=0;

		for(int i=0; i<arg1.length; i++) {
			if(arg1[i]==arg2[0]) {
				int a=0;
				for(int j=0; j<arg2.length; j++) {
					if(arg2[j]==arg1[i+j]) a++;
				}
				if(a==arg2.length) {
					n++;
					i = i+a-1;
				}
			}
		}

		int x=arg1.length-(n*arg2.length)+(n*arg3.length);
		char[] arr = new char[x];

		int c=0;
		for(int i=0; i<x; i++) {

			arr[i]=arg1[c];
			int a=0;
			if(arg1[c]==arg2[0]) {

				for(int j=0; j<arg2.length; j++) {
					if(arg2[j]==arg1[c+j]) a++;
				}
				if(a==arg2.length) {
					for(int k=0; k<arg3.length; k++) {
						arr[i+k]=arg3[k];
					}
					i = i+arg3.length-1;
				}
				else a=0;
			}
			if(a>0) c= c+a;
			else 	c= c+1;
		}

		return arr;

	}


}
