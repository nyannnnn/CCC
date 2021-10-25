import java.util.*;

public class S1_2021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] hei = new double[n + 1];
		double[] width = new double[n];
		double sum = 0;
		for (int i = 0; i < n + 1; i++) {

			hei[i] = Integer.parseInt(sc.next());

		}
		for (int i = 0; i < n; i++) {

			width[i] = Integer.parseInt(sc.next());

		}
		for (int i = 0; i < n; i++) {

			sum += ((hei[i] + hei[i+1])*width[i])/2;
			
		}
		System.out.println(sum);
	}

}