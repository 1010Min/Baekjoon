import java.util.*;

public class N_2562 {
	public static void main(String[] args) {
		int max = -1, max_index=0;
		int[] num = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
				max_index = i;
			}
		}
		System.out.println(max);
		System.out.println(max_index+1);
	}
}
