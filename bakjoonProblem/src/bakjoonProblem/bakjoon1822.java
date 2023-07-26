package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class bakjoon1822 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		TreeSet<Integer> set = new TreeSet<>();
		st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {

			set.add(Integer.parseInt(st.nextToken()));

		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (set.contains(n)) {
				set.remove(n);
			}
		}

		System.out.println(set.size());

		for (int n : set) {

			System.out.print(n + " ");
		}

	}

}
