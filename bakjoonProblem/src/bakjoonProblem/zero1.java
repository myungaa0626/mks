package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class zero1 {

	public static void main(String[] args) throws IOException {

		LinkedList<Integer> list = new LinkedList();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			int numInput = Integer.parseInt(br.readLine());
			list.add(numInput);

			if (numInput == 0) {

				list.removeLast();
				list.removeLast();

			}
		}
		int sum = 0;
		for (Integer integer : list) {

			sum += integer;
		}
		System.out.println(sum);
	}
}