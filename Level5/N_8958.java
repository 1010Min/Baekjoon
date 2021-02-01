import java.io.*;
import java.util.*;

public class N_8958 {
	public static void main(String[] args) throws IOException{
		int n, count=1, sum = 0;
		String input;
		String[] num = null;
		
 		Scanner sc = new Scanner(System.in);
 		n = sc.nextInt();
 		
 		for(int i=0; i<n; i++) {
 			input = sc.next();
 			num = input.split("");
 			
 			for(int j=0; j<num.length; j++) {
 				//count = 1; 
 				if(num[j].contains("O")) {
 					sum += count;
 					count++;
 				}
 				else
 					count = 1;
 			}
 			System.out.println(sum);
 			sum=0;	count = 1;
 		}
	}
}
