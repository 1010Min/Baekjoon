import java.io.*;
import java.util.StringTokenizer;

public class N_10951 {
	public static void main(String[] args) throws IOException {
		int a=0,b=0;
		String w ="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while((w=br.readLine()) != null) { // eclipse¿¡¼­ EOF´Â Ctrl+Z
			StringTokenizer st = new StringTokenizer(w);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(a+b));	
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
