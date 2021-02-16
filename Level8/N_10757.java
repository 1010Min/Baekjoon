import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class N_10757 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		System.out.println(A.toString());
		
		br.close();
	}
}

// 이렇게 하면 틀림!
//public class N_10757 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		double A = Double.parseDouble(st.nextToken());
//		double B = Double.parseDouble(st.nextToken());
//		
//		System.out.println(A+B);
//		
//		br.close();
//	}
//}
