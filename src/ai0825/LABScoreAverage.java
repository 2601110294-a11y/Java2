package ai0825;

import java.util.Scanner;

public class LABScoreAverage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] scoreArr = new int[5];
        int sum = 0;
        double avg;
        System.out.println("김연아 선수 경기 끝났습니다~~~짝짝짝");

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("심사위원분들은 최대 10점까지 주실 수 있습니다.");
            System.out.print("심사위원" + (i + 1) + ":");
            scoreArr[i] = s.nextInt();
            sum += scoreArr[i];
        }
        System.out.println();
        avg = (double) sum / scoreArr.length;

        System.out.println("[심사위원 입력점수]");
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.printf("심사위원 %d : %d점 " , i +1,scoreArr[i]);

        }
        System.out.println("합계점수:"+ sum);
        System.out.printf("평균점수: %.2f",avg);
    }
}
