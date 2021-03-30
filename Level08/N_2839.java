import java.io.*;

public class N_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N % 5 == 0) { // 민약 5로 나누어떨어진다면
			System.out.println(N/5);
			return;
		}
		else {
			int check = N/5;
			
			for(int i=check; i>0; i--) {
				// 5로 나누어지지 않은 경우 3으로 나눌 수 있는지 확인하기 위해 하나씩 빼면서 3으로 나누어지나 확인 
				int num = N - (i*5); 
				
				if(num%3 == 0) {
					System.out.println(i+(num/3));
					return;
				}
			}
		}
		
		if(N%3 == 0) {
			System.out.println(N/3);
		}
		
		else {
			System.out.println(-1);
		}
		br.close();
		return;
	}
}