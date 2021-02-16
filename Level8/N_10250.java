import java.util.*;
import java.io.*;

public class N_10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			// 같은 W면 윗층 H부터 채워짐(101->201->301...->102) 
			
			if(N % H == 0) {
				System.out.println((H*100) + (N/H));
			}
			
			else {
				System.out.println(((N%H)*100) + (N/H+1));
			}
		}
		br.close();
	}
}
