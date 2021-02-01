import java.util.*;

public class N_4344 {
	public static void main(String[] args) {
		int c, n, number=0; double avr=0;
		int[] score;
		
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		
		for(int i=0; i<c; i++) {
			n = sc.nextInt();
			score = new int[n];
			
			for(int j=0; j<n; j++) {
				score[j] = sc.nextInt();
				avr += score[j];
			}
			
			avr = (double)avr/n;
			
			for(int j=0; j<n; j++) {
				if(score[j] > avr)
					number++;
			}
			
			System.out.println(String.format("%.3f", (double)number/n*100)+"%");
			number = 0; avr = 0;
		}
	}
}
