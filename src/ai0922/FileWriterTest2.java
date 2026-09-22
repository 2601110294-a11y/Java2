package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("myData3.txt");

            System.out.println("저장할 내용을 입력하시오");
            System.out.println("끝이라고 입력하면 종료됩니다");

            while(true) {
                String line = sc.nextLine();

                if (line.equals("끝")) {
                    break;
                }

                fw.write(line + "\n");
            }
            fw.close();

            System.out.println("myData3.txt에 내용 저장 완료");
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}
