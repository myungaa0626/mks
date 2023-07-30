package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjoon5046 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 참가자의 수
        int b = Integer.parseInt(st.nextToken()); // 예산
        int h = Integer.parseInt(st.nextToken()); // 호텔 수
        int w = Integer.parseInt(st.nextToken()); // 고를 수 있는 주의 개수

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < h; i++) { // 각 호텔에 대해서
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()); // 일인당 숙박비용
            boolean stay = false;
            for (int j = 0; j < w; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a >= n) { // 인원이 충분할 때
                    stay = true;
                }
            }
            if (stay) {
                answer = Math.min(answer, n * p); // 최솟값 갱신
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println("stay home");
        } else if (answer <= b) { // 예산 내에서 가능할 때
            System.out.println(answer);
        } else {
            System.out.println("stay home");
        }
    }
}
