import java.util.*;

public class N_1110 {
	public static void main(String[] args) {
		int n, sum=0, result=0, len=0;
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
//		System.out.println(n/10); // 10�� �ڸ� ��
//		System.out.println(n%10); // 1�� �ڸ� ��
		if(n<10)
			sum = n*10+n;
		else 
			sum = ((n/10)+(n%10))%10 + (n%10)*10;
		
		while(sum != n) {
			sum = ((sum/10)+(sum%10))%10 + (sum%10)*10;
			len++;
		}
		System.out.println(len+1); // if-else������ 1�� ���������Ƿ�
	}
}
