import java.io.*;
import java.util.*;

public class N_3052 {
	public static void main(String[] args) throws IOException{
		// HashSet�� �ߺ� ���� ��� X but ���� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hash.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(hash.size());
		br.close();
	}
}
