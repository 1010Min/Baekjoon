import java.io.*;
import java.util.*;

public class N_2775 {
	public static int[][] Home = new int[15][15];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		count();
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(Home[k][n]);
		}
		br.close();
	}
	
	public static void count() {
		for(int i=0; i<15; i++) {
			Home[0][i] = i; // 0층 i호에 i명 산다
			Home[i][1] = 1; // i층 1호에 1명 산다
		}
		
		for(int floor=1; floor<=14; floor++) { 
			for(int room=2; room<=14; room++) {
				Home[floor][room] = Home[floor-1][room] + Home[floor][room-1];
			}
		}
	}
	
}
