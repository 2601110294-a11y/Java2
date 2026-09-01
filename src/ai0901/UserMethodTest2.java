package ai0901;

import java.util.Scanner;

public class UserMethodTest2 {
    public static int plus(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1.정수입력:");
        int n1 = s.nextInt();
        System.out.print("2.정수입력:");
        int n2 = s.nextInt();

        int result = plus(n1,n2);
        System.out.printf("%d + %d = %d", n1 , n2 ,result);



        s.close();

    }
}
