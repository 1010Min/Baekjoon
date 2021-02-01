import java.util.*;

public class N_10818 {
	public static void main(String[] args){
		int n, min=1000000, max=-1000000;
		int[] num;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] > max)
				max = num[i];
			if(num[i] <= min)
				min = num[i];
		}
		System.out.println(min + " " + max);
	}
}
