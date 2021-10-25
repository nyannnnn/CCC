import java.util.*;

public class S2_2021 {

	public static int sum = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		//0 == black && 1 == gold
		int [] [] canvas = new int [m][n];
		for(int i = 0; i < k; i ++) {
			
			String s = sc.next();
			int rc = sc.nextInt();
			rc--;
			if(s.equals("R")) {
				canvas = row(canvas, m, n, rc);
			}
			if(s.equals("C")) {
				canvas = col(canvas, m, n, rc);
			}
		}
		System.out.println(sum);
	}
	
	public static int [] [] row(int [][] canvas, int m, int n, int rc){
		
		for(int i = 0; i < n; i++) {
			if(canvas[rc][i] == 0) {
				canvas[rc][i] = 1;
				sum++;
			}
			else if(canvas[rc][i] == 1) {
				canvas[rc][i] = 0;
				sum--;
			}
		}
		return canvas;
		
	}
	
	public static int [] [] col(int [][] canvas, int m, int n, int rc){
		for(int i = 0; i < m; i++) {
			if(canvas[i][rc] == 0) {
				canvas[i][rc] = 1;
				sum++;
			}
			else if(canvas[i][rc] == 1) {
				canvas[i][rc] = 0;
				sum--;
			}
		}		
		return canvas;
	}

}