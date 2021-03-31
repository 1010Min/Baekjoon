import java.io.*;

public class N_4948 {
	public static boolean check_prime[]; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0)	break;
			
			else {
				int sum = 0;
				check_prime = new boolean[input*2+1]; 
				
				prime();
				
				for(int i=input+1; i<=input*2; i++) {
					if(!check_prime[i]) {
						sum += 1;
					}
				}
				System.out.println(sum);
				continue;
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
