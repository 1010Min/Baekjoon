import java.util.*;
import java.io.*;

public class N_3009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] n_1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine()," ");
		int[] n_2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine()," ");
		int[] n_3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		int x_4 = 0;	int y_4 = 0;
		
		// 1번 vs 2번 - x
		if(n_1[0] == n_2[0])	x_4 = n_3[0];
		// 1번 vs 3번 - x
		else if(n_1[0] == n_3[0])	x_4 = n_2[0];
		// 2번 vs 3번 - x
		else if(n_2[0] == n_3[0])	x_4 = n_1[0];
		
		// 1번 vs 2번 - y
		if(n_1[1] == n_2[1])	y_4 = n_3[1];
		// 1번 vs 3번 - y
		else if(n_1[1] == n_3[1])	y_4 = n_2[1];
		// 2번 vs 3번 - y
		else if(n_2[1] == n_3[1])	y_4 = n_1[1];
		
		System.out.println(x_4 + " " + y_4);
		
		br.close();
	}
}
