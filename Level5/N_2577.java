import java.util.*;

public class N_2577 {
	public static void main(String[] args){
		int a,b,c,mul;
		int[] count = new int[10];
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		mul = a*b*c;
		
		while(mul>0) {
			count[mul%10]++;
			mul /= 10;
		}
		
		for(int i=0; i<count.length; i++)
			System.out.println(count[i]);
	}
}
