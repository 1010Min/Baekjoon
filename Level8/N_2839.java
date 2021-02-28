import java.io.*;

// 방법 1
//public class N_2839 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		if (N == 4 || N == 7) {
//			System.out.println(-1);
//		}
//		else if (N % 5 == 0) {
//			System.out.println(N / 5);
//		}
//		else if (N % 5 == 1 || N % 5 == 3) {
//			System.out.println((N / 5) + 1);
//		}
//		else if (N % 5 == 2 || N % 5 == 4) {
//			System.out.println((N / 5) + 2);
//		}
//		
//	}
//}
//
//// /는 몫이고 %는 나머지
///*
//	n		3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22	23	24	25
//	개수		1	-1	1	2	-1	2	3	2	3	4	3	4	3	4	5	4	5	4	5	6	5	6	5
//	n/5		0	0	1	1	1	1	1	2	2	2	2	2	3	3	3	3	3	4	4	4	4	4	5
//	n%5		3	4	0	1	2	3	4	0	1	2	3	4	0	1	2	3	4	0	1	2	3	4	0
//	
//	5의 배수+3 -> 봉지 개수 최소
//	5의 배수+1 -> 봉지 개수 1개 증가
//	5의 배수-1(n=4일 때 제외) -> 봉지 개수 3에서 1씩 증가
//	12+5의 배수 -> 봉지 1씩 증가
//*/

// 방법 2
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