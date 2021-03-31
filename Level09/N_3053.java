import java.io.*;

public class N_3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double R = Double.parseDouble(br.readLine());
		
		System.out.println(String.format("%.6f", R * R * Math.PI) ); // 유클리드 기하학 원 넓이 
		System.out.println(String.format("%.6f",R * R * 2)); // 택시 기하학 원 넓이 

		br.close(); 
	}
}
