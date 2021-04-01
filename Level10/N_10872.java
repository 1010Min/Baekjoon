import java.io.*;

public class N_10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new	BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N == 0)	System.out.println(1);
		
		else	System.out.println(factorial(N));
			
		br.close();
	}
	
	public static int factorial(int N) {
		if(N <= 1)	return 1; // 종료
		
		return N*factorial(N-1);
	}
}