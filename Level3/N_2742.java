import java.io.*;

public class N_2742 {
	public static void main(String[] args) throws IOException {
		int a;	String w;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		a = Integer.parseInt(br.readLine());
		
		for(int i=a; i>=1; i--) {
			w = Integer.toString(i);
			bw.write(w+"\n");
		}
		bw.flush();
		bw.close();
		br.close(); 
	}
}
