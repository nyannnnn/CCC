import java.util.Scanner;

public class S1_2017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sw1 = new String[n];
		String[] se1 = new String[n];
		int[] sw = new int[n];
		int[] se = new int[n];
		int sum = 0;

		// getting sw
		for (int i = 0; i < n; i++) {

			sw1[i] = sc.next();
			sw[i] = Integer.parseInt(sw1[i]);

		}

		// getting se
		for (int i = 0; i < n; i++) {

			se1[i] = sc.next();
			se[i] = Integer.parseInt(se1[i]);

		}

		// comparing
		
		int k = 0, sum1 = 0, sum2 = 0;
		for(int i = 0; i < n; i++) {
			
			sum1 += sw[i];
			sum2 += se[i];
			
			if(sum1 == sum2) {
				k = i+1;
			}
			
		}
		System.out.println(k);
		
	}

	public static int[] fillprefixsum(int arr[], int n) {
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];

		for (int i = 1; i < n; ++i)
			prefixSum[i] = prefixSum[i - 1] + arr[i];

		return prefixSum;
	}

}
