package bakjoonProblem;

import java.util.Scanner;

public class bakjoon1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numCount = new int[10];
        int maxSet = 0;

        String roomNumber = sc.nextLine();
        for (int i = 0; i < roomNumber.length(); i++) {
            int num = Character.getNumericValue(roomNumber.charAt(i));
            if (num == 6 || num == 9) {
                numCount[6]++;
            } else {
                numCount[num]++;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == 6) {
                numCount[i] = (numCount[i] + 1) / 2; // 6과 9는 서로 뒤집어서 사용할 수 있으므로 반으로 나눠줍니다.
            }
            maxSet = Math.max(maxSet, numCount[i]);
        }

        System.out.println(maxSet);
        sc.close();
    }
}
