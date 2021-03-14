import java.io.*;
import java.util.*;

public class N_1002 {
	public static int count;
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			count_locate(x1, y1, r1, x2, y2, r2);
			
			System.out.println(count);
		}
		br.close();
	}
	
	public static void count_locate(int x1, int y1, int r1, int x2, int y2, int r2) {
		/*
		 1. 두 원의 중심 동일, r 동일 -> 위치 무한개
		 2. 두 점 사이 거리 > 반지름 길이 합 -> 위치 0개
		 3. 내접하는 경우 -> 위치 1개
		 4. 외접하는 경우 -> 위치 1개
		 +) 5. 원 안에 원이 있으나 내접하지 않는 경우 -> 위치 0개
		 */
		
		int distance = (int) (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1 == x2 && y1 == y2 && r1 == r2)	count = -1; // 1번
		
		else if(distance > Math.pow(r1+r2, 2))		count = 0; // 2번
		
		else if(distance == Math.pow(r2-r1, 2))	count = 1; // 3번
		
		else if(distance == Math.pow(r1+r2, 2))	count = 1; // 4번
		
		else if (distance < Math.pow(r2-r1, 2))	count = 0; // 5번
		
		else	count = 2;
		
		/*
		해당 방식으로 계산하면 int로 인해 소숫점 아래가 버려질 수 있으므로 오류 발생할 수 있음!	
		
		int distance = (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1 == x2 && y1 == y2 && r1 == r2)	count = -1; // 1번
		
		else if(distance > (r1+r2))		count = 0; // 2번
		
		else if(distance == Math.abs(r2-r1))	count = 1; // 3번
		
		else if(distance == (r1+r2))	count = 1; // 4번
		
		else if (distance < Math.abs(r2-r1))	count = 0; // 5번
		
		else	count = 2;
		*/
	}
}
