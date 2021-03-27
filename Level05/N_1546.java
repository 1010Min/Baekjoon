import java.util.*;

public class N_1546 {
	public static void main(String[] args) {
		int n,m=0; double ev=0;	double[] score;	double[] new_score = null;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		score = new double[n];
		new_score = new double[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			new_score[i] = score[i];
			if(score[i] > m) 
				m = (int)score[i];
		}
		
		for(int j=0; j<new_score.length; j++) {
			new_score[j] = (double)(score[j]/m)*100;
			ev = ev+ new_score[j];
		}
		System.out.println((double)ev/n);
	}
}
