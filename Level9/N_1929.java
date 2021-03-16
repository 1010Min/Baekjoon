import java.io.*;
import java.util.*;

public class N_1929 {
	public static boolean check_prime[]; // 소수 체크할 배열 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		check_prime = new boolean[N+1]; 
		
		prime();
		
		for(int i=M; i<=N; i++) {
			if(!check_prime[i]) {
				System.out.println(i);
			}
		}
		
		br.close();
		
	}
	
	public static void prime() {
		check_prime[0] = true; // 0은 소수가 아니므로
		check_prime[1] = true; // 1은 소수가 아니므로
		
		for(int i=2; i <= Math.sqrt(check_prime.length); i++) {
			if(check_prime[i]) continue;
			
			for(int j=i*i; j<check_prime.length; j += i) {
				check_prime[j] = true;
			}
			
		}
	}

}
