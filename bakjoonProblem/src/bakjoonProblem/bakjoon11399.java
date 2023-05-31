package bakjoonProblem;

import java.util.Arrays;
import java.util.Scanner;

public class bakjoon11399 { // 다시 체크 해야됨

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 인원수

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);

		int total = 0;
		int[] list = new int[n];
		list[0] = arr[0];

		for (int i = 1; i < n; i++) {
			list[i] = arr[i]+list[i-1];
		}
		for(int item:list) total+=item;
		System.out.println(total);
	}
}
