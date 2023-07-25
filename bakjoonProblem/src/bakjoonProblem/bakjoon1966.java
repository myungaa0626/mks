package bakjoonProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class bakjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            Queue<int[]> queue = new LinkedList<>();
            List<Integer> list = new ArrayList<>();

            input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(input[i]);
                queue.add(new int[] {i, priority});
                list.add(priority);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int maxPriority = Collections.max(list);

                if (current[1] == maxPriority) {
                    count++;
                    list.remove((Integer) maxPriority);

                    if (current[0] == m) {
                        sb.append(count).append('\n');
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }
        }
        System.out.print(sb.toString());
    }
}