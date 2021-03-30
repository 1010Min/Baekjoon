import java.io.*;
import java.util.*;

public class N_1011 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y-x;
			
			int max = (int)Math.sqrt(distance); // 이동할 수 있는 거리의 최대값
			int count = 0;
			
			if(max == Math.sqrt(distance)) // max 값이 변할 때 count = 2 X max -1 s
				count = max*2-1;
			
			else if(distance <= max*max+max) // max 변하는 구간 사이에 count가 2번 변함
				count = max*2;
			
			else // max의 제곱값 뒤에는 count가 증가함
				count = max*2+1;
			
			System.out.println(count);
		}
	}
}
